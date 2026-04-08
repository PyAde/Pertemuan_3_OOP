import buktiPembayaran.BuktiPembayaran;
import login.Login;
import pembayaranPajakKendaraan.PembayaranPajakMobil;
import pembayaranPajakKendaraan.PembayaranPajakMotor;
import pencocokanKendaraan.PencocokanKendaraan;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM E-SAMSAT ===");

        Login user1 = new Login("Adi", "user123");
        PencocokanKendaraan transport_1 = new PencocokanKendaraan("012345", "AB-123", "BC-123", "CD-123");

        boolean loginBerhasil = user1.validasiLogin();

        if(loginBerhasil){
            System.out.println("Login atas nama " + user1.getUsername() + " berhasil");
            System.out.println("--------------------------------------------------");
        

            String pencocokanKendaraan = transport_1.pencocokanKendaraan();
            System.out.println(pencocokanKendaraan);
            
            // Validasi kendaraan;
            boolean validasiBerhasil = transport_1.validasiData();
            if(validasiBerhasil){
                System.out.println("Validasi kendaraan atas nama " + user1.getUsername() + " berhasil dilakukan");
                System.out.println("--------------------------------------------------");
                

                System.out.println("\n Memproses Pembayaran Pajak Mobil...");
                PembayaranPajakMobil pajakMobil = new PembayaranPajakMobil("TRX-001", "10-04-2026", 2000, "SUV");
                pajakMobil.setMetodePembayaran("Transfer Bank");
                
                // Proses bayar dan tangkap resinya
                BuktiPembayaran resiMobil = pajakMobil.prosesPembayaran("LUNAS");
                resiMobil.tampilkanBuktiPembayaran(); // Cetak struk mobil


                System.out.println(">> Memproses Pembayaran Pajak Motor...");
                PembayaranPajakMotor pajakMotor = new PembayaranPajakMotor("TRX-002", "10-04-2026", 150, "Matic");
                pajakMotor.setMetodePembayaran("CASH");
                

                BuktiPembayaran resiMotor = pajakMotor.prosesPembayaran("LUNAS");
                resiMotor.tampilkanBuktiPembayaran(); // Cetak struk motor

            }else{
                System.out.println("Validasi kendaraan atas nama" + user1.getUsername() + " tidak berhasil dilakukan");
            }
            
            System.out.println("--------------------------------------------------");
            user1.logout();
            
        }else{
            System.out.println("Username dan password yang anda masukan salah");
        }
    }
}
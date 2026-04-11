import buktiPembayaran.BuktiPembayaran;
import login.Login;
import pembayaranPajakKendaraan.PembayaranPajakMobil;
import pembayaranPajakKendaraan.PembayaranPajakMotor;
import pencocokanKendaraan.PencocokanKendaraan;

public class Main {
    public static void main(String[] args) {
        

        Login user1 = new Login();
        PencocokanKendaraan transport_1 = new PencocokanKendaraan("012345", "AB-123", "BC-123", "CD-123");

        boolean loginBerhasil = user1.validasiLogin();

        if(loginBerhasil){
            System.out.println("Login atas nama " + user1.getUsername() + " berhasil masuk");
            
        

            String pencocokanKendaraan = transport_1.pencocokanKendaraan();
            System.out.println(pencocokanKendaraan);
            
            // Validasi kendaraan;
            boolean validasiBerhasil = transport_1.validasiData();
            System.out.println("\n");
            if(validasiBerhasil){
                System.out.println("=== BUKTI PEMBAYARAN PAJAK MOBIL ===");
                PembayaranPajakMobil pajakMobil = new PembayaranPajakMobil("Transaksi-001", "10-10-1010", 2000, "SUV");
                pajakMobil.setMetodePembayaran("Transfer Bank");
                
                
                BuktiPembayaran resiMobil = pajakMobil.prosesPembayaran("LUNAS");
                resiMobil.tampilkanBuktiPembayaran(); 
                System.out.println("=========================================\n");

                System.out.println("=== BUKTI PEMBAYARAN PAJAK MOTOR===");
                PembayaranPajakMotor pajakMotor = new PembayaranPajakMotor("Transaksi-002", "10-10-1010", 150, "Matic");
                pajakMotor.setMetodePembayaran("CASH");
                
                
                BuktiPembayaran resiMotor = pajakMotor.prosesPembayaran("LUNAS");
                resiMotor.tampilkanBuktiPembayaran(); 
                System.out.println("=========================================\n");


            }else{
                System.out.println("Validasi kendaraan atas nama" + user1.getUsername() + " tidak berhasil dilakukan");
            }
            
            
            user1.logout();
            
        }else{
            System.out.println("Username dan password yang anda masukan salah");
        }
    }
}
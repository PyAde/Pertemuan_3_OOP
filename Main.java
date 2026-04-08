public class Main {
    public static void main(String[] args) {
        // Data pengguna
        Login user1 = new Login("Adi", "user123");
        PencocokanKendaraan transport_1 = new PencocokanKendaraan("012345", "AB-123", "BC-123", "CD-123");

        boolean loginBerhasil = user1.validasiLogin();

        if(loginBerhasil){
            System.err.println("Login atas nama " + user1.getUsername() + " berhasil");
        
            // Validasi kendaraan;
            boolean validasiBerhasil = transport_1.validasiData();
            if(validasiBerhasil){
                System.out.println("Validasi kendaraan atas nama " + user1.getUsername() + "berhasil dilakukan");
                // lanjut ke proses class diagram berikutnya 

            }else{
                System.out.println("Validasi kendaraan atas nama" + user1.getUsername() + "tidak berhasil dilakukan");
            }
        user1.logout();
        }else{
            System.out.println("Username dan password yang anda masukan salah");
        }
    }
}

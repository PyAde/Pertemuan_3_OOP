public class Main {
    public static void main(String[] args) {
        Login user1 = new Login("user", "user123");

        boolean loginBerhasil = user1.validasiLogin();

        if(loginBerhasil){
            System.err.println("Login atas nama " + user1.getUsername() + " berhasil");
        
            // Validasi kendaraan;
            PencocokanKendaraan transport_1 = new PencocokanKendaraan("012345", "AB-123", "BC-123", "CD-123");
            boolean validasiBerhasil = transport_1.validasiData();
            if(validasiBerhasil){
                System.out.println("Validasi kendaraan atas nama " + user1.getUsername() + "berhasil dilakukan");
            }else{
                System.out.println("Validasi kendaraan atas nama" + user1.getUsername() + "tidak berhasil dilakukan");
            }
            // lanjut ke proses class diagram berikutnya 

        
        user1.logout();
        }else{
            System.out.println("Username dan password yang anda masukan salah");
        }
    }
}

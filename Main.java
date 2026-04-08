public class Main {
    public static void main(String[] args) {
        Login user1 = new Login("user", "user123");

        boolean loginBerhasil = user1.validasiLogin();

        if(loginBerhasil){
            System.err.println("Login atas nama " + user1.getUsername() + " berhasil");
        
        
        user1.logout();
        }else{
            System.out.println("Username dan password yang anda masukan salah");
        }
    }
}

package login;
import java.util.Scanner;
public class Login {
  
    private  String username;
    private  String password;
    public  Login(String username, String password){
        this.username = username;
        this.password = password;
    }
    public Login(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama: ");
        this.username = input.nextLine();
        System.out.print("Masukan password: ");
        this.password = input.nextLine();
    }
    public boolean validasiLogin(){
        if(this.username.equals("Adi") && this.password.equals("user123")){
            System.out.println("Login berhasil");
            return true;
        }else{
            System.out.println("Nama dan password yang anda masukan salah");
            return false;
        }
    }
    public String getUsername(){
        return this.username;
    }
    public void logout(){
        System.out.println(getUsername() +" berhasil keluar dari aplikasi pembayaran pajak");
    }
}

import java.io.Console;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String kullanici = "Admin" , sifre="123";

        System.out.print("Kullanıcı Adı: ");
        String userName = input.nextLine();
        System.out.print("Şifre: ");
        String password = input.nextLine();
        if (userName.equals(kullanici) && password.equals(sifre)) {
            System.out.println("Giriş Başarılı");
        }
        else if (userName.equals(kullanici) && !password.equals(sifre)) {
            System.out.println("Şifreniz Hatalı");
            System.out.println("Şifrenizi Sıfırlamak İstiyorsanız:1\nİstemiyorsanız:2");
            String islem = input.nextLine();
            switch (islem) {
                case "1":
                    System.out.print("Yeni Şifre:");
                    String newPassword = input.nextLine();
                    if (newPassword.equals(sifre)) {
                        System.out.println("Kullandığınız Şifre Olamaz");
                    } else
                        System.out.println("Şifre Oluşturuldu");
                    break;
                case "2":
                    System.out.print("Tekrar Deneyiniz");
                    break;
                default:
                    System.out.print("Lütfen Doğru İşlem Seçiniz");
            }
        }
        else if(!userName.equals(kullanici) && password.equals(sifre)){
            System.out.println("Kullanıcı Adı Hatalı");


        }
        else
            System.out.println("Kullanıcı Adı ve Şifre Hatalı");
    }
}
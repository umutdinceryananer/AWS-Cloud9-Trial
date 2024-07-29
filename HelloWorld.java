import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturularak kullanıcıdan giriş alınır
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya bir isim girmesi için mesaj gösterilir
        System.out.print("Lütfen adınızı giriniz: ");
        String name = scanner.nextLine();

        // Girilen isim ekrana yazdırılır

        // Scanner nesnesi kapatılır
        scanner.close();
    }
}

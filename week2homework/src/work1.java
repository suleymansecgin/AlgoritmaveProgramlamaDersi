/*
adım1:Başla.
adım2:Kullanıcıdan kenar uzunluğu ve o kenara ait yüksekliği iste.
adım3:Üçgende alan hesabını yap.(a.h/2)
adım4:Çıkan sonucu ekrana yazdır.
adım5:Bitir.
*/
import java.util.Scanner;
public class work1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kenar uzunluğunu giriniz:");
        double a = input.nextDouble();
        System.out.println("Kenara ait yüksekliği giriniz:");
        double h = input.nextDouble();
        
        double A = a * h / 2;
        
        System.out.println("Üçgenin Alanı:" +A);
        
    }
    
}

/*
adım1:Başla.
adım2:Kullanıcıdan maddenin kütlesini, yerden yüksekliğini ve hızını iste.
adım3:Maddenin potansitel ve kinetik enerjisini hesapla.(pe=10mh, ke=0.5 * m * v^2)
adım4:Çıkan sonuçları ekrana yazdır.
adım5:Bitir.
*/
import java.util.Scanner;
public class work4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Maddenin kütlesini giriniz:");
        double m = input.nextDouble();
        
        System.out.println("Maddenin yerden yüksekliğini giriniz:");
        double h = input.nextDouble();
        
        System.out.println("Maddenin hızını giriniz:");
        double v = input.nextDouble();
        
        double pe = m * 10 * h;
        double ke = 0.5 * m * v*v;
        
        System.out.println("Maddenin Potansiyel Enerjisi: "+pe);
        System.out.println("Maddenin Kinetik Enerjisi: "+ke);
    }
    
}

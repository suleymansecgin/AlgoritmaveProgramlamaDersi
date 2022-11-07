/*
adım1:Başla.
adım2:Klavyeden yarıçap değerini gir.
adım3:Kürenin alanı ve hacmini hesapla.(A=4*3.14*r^2)(V=4/3 * 3.14 * r^3)
adım4:Çıkan değerleri ekrana yazdır.
adım5:Bitir.
*/
import java.lang.Math;
import java.util.Scanner;
public class work3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Yarıçap değerini giriniz:");
        double r = input.nextDouble();
        
        
        
        double alan = Math.pow(r, 2);
        double kup = Math.pow(r,3);
        
        double A = 4 * 3.14 * alan;
        double V = 4/3 * 3.14 * kup;
        
        System.out.println("Kürenin Alanı: " +A +" " +"Kürenin Hacmi: "+V);
        
        
        
    }
    
}

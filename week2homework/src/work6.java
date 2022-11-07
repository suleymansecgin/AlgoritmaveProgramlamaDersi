/*
adım1:Başla
adım2:Kullanıcıdan boy ve kilo değerlerini iste.
adım3:Verilen değerlere göre vki hesapla.(vki =kilo/boy^2)
adım4:Çıkan sonucu ekrana yazdır.
adım5:Bitir
 */
import java.util.Scanner;
public class work6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Boyunuzu Giriniz:");
        double boy = input.nextDouble();
        
        System.out.println("Kilonuzu Giriniz:");
        double kilo = input.nextInt();
        
        double vki = kilo / (boy * boy);
        
        System.out.println("Vücut Kitle Endeksiniz:" +vki);
    }
    
}

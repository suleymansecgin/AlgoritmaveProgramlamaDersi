/*
adım1:Başla.
adım2:Kullanıcıdan doğum yılını ve bulunduğu yılı iste.
adım3:Bulunduğu yıldan doğum yılını çıkartarak yaşını hesapla.
adım4:Çıkan yaşı ekrana yazdır.
adım5:Bitir.
*/
import java.util.Scanner;
public class work7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Doğum yılınız:");
        int dy = input.nextInt();
        
        System.out.println("Bulunduğunuz yıl:");
        int by = input.nextInt();
        
        int yas = by - dy;
        
       System.out.println("Yaşınız: "+yas);
    }
    
}

/*
adım1:Başla.
adım2:Kullanıcıdan iletkenin direncini ve akımını iste.
adım3:Verilen değerlere göre iltekenin iki ucu arasındaki gerilimi hesapla.(V=i*R)
adım4:Çıkan sonucu ekrana yazdır.
adım5:Bitir.
*/
import java.util.Scanner;
public class work5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("İletkenin direncini giriniz:");
        int R = input.nextInt();
        
        System.out.println("İletkenin akımını giriniz:");
        int i = input.nextInt();
        
        double V = i * R;
        System.out.println("İletkenin iki ucu arasındaki gerilim: "+V +"V");
    }
    
}

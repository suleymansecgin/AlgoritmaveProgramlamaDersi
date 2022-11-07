/*
adım1:Başla
adım2:Ekrana yapılmak istenen dönüştürme işlemini yazdır.(1-mm,2-cm,3-dm,4-km)
adım3:Yapılmak istenen işlemi klavyeden gir.
adım4:Klavyeden n değeri gir.
adım5:Eğer 1 ise mm=n*1000 yazdır mm değil ise git adım 6
adım6:Eğer 2 ise cm = n*100 yazdır cm değil ise git adım 7
adım7:Eğer 3 ise dm = n/10 yazdır dm değil ise git adım 8
adım8:Eğer 4 ise km = n/1000 yazdır km değil ise yazdır geçersiz işlem
adım9:Bitir.
 */
import java.util.Scanner;
public class work1 {
    public static void main(String[] args) {
        System.out.println("Dönüştürme İşlemleri\n1-mm\n2-cm\n3-dm\n4-km");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yapmak İstediğiniz İşlemi Giriniz: ");
        int islem = input.nextInt();
        
        System.out.print("Metre Cinsinden Bir Değer Giriniz: ");
        int n = input.nextInt();
        
        if (islem == 1) {
            int mm = n*1000;
            System.out.println(n+" m = "+mm+" mm");
        } else if (islem == 2) {
            int cm = n*100;
            System.out.println(n+" m = "+cm+" cm");
        } else if (islem == 3) {
            int dm = n*10;
            System.out.println(n+" m = "+dm+" dm");
        } else if (islem == 4) {
            int km = n/1000;
            System.out.println(n+" m = "+km+" km");
        }else
            System.out.println("Geçersiz İşlem Girdiniz...");
    }
    
}

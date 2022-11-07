/*
adım1:Başla
adım2:Klavyeden 1-7 arasında bir sayı gir.
adım3:1-7 arasındaki sayıları günlere göre if komutuyla tanımla
(1-pzt, 2-salı, 3-çrş, 4-prş, 5-cuma, 6-cts, 7-pzr)
adım4:Girilen sayıya göre hangi gün olduğunu ekrana yazdır.
adım5:Bitir
*/

import java.util.Scanner;
public class work2{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Klavyeden 1-7 arası bir sayı giriniz: ");
        int sayi = input.nextInt();
        
        if(sayi == 1){
            System.out.println("Pazartesi");
        }else if (sayi == 2) {
            System.out.println("Salı");
        }else if (sayi == 3) {
            System.out.println("Çarşamba");
        }else if (sayi == 4) {
            System.out.println("Perşembe");
        }else if (sayi == 5) {
            System.out.println("Cuma");
        }else if (sayi == 6) {
            System.out.println("Cumartesi");
        }else if (sayi == 7) {
            System.out.println("Pazar");
        }else{
            System.out.println("Tanımsız Sayı Girdiniz....");
        }
    }
}
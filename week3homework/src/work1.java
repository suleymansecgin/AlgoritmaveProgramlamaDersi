/*
adım1:Başla
adım2:Klavyeden bir tam sayı al.
adım3:Girilen tam sayının if komutuyla pozitif negatif veya 0 olduğunu sorgula
adım4:Çıkan sonucu ekrana yazdır.
adım5:Bitir
*/
import java.util.Scanner;
public class work1{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        
        if(sayi<0){
            System.out.println("Sayı Negatiftir.");
        } else if (sayi>0) {
            System.out.println("Sayı Pozitiftir.");
        }else{
            System.out.println("Sayı 0'dır");
        }
    }
}
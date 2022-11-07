/*
adım1:Başla
adım2:Klavyden bir sayı gir.
adım3:toplam = 0
adım4:s=1
adım5:Eğer s>n ise git adım10
adım7:Eğer s sayısının 2 ile bölümünden kalan 0 ise git adım10
adım6:toplam = toplam + s
adım7:S=S+1
adım8:Yazdır toplam
adım9:Git adım5
adım10:cifttoplam = 0 , i = 1
adım11:Eğer i>n ise git adım17
adım12:Eğer i%2!=0 ise git 
adım13:toplam = toplam + i
adım14:i = S+i
adım15:yazdır toplam
adım16:git adım11
adım17:Bitir.
 */
import java.util.Scanner;
public class work4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Klavyeden bir sayı giriniz: ");
        int n = input.nextInt();
        
        int s = 1;
        int cifttoplam = 0;
        int tektoplam = 0;
        
        while(s<=n){
            if (s%2==0) {
                cifttoplam = cifttoplam + s;
                
            }else{
                tektoplam = tektoplam + s;
            }
            s++; 
        }
        System.out.println("Çift Sayıların Toplamı: "+cifttoplam +"\nTek Sayıların Toplamı: " +tektoplam );
    }
    
}

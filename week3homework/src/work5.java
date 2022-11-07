/*
adım1:Başla
adım2:Klavyeden 2 sayı al.
adım3:Toplam = 0
adım4:c = 0
adım5:Eğer c>= s2 ise git adım9
adım6:c++
adım7:toplam = toplam +s1;
adım8:yazdır toplam
adım9:bitir
*/
import java.util.Scanner;
public class work5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1.Sayıyı Giriniz: ");
        int s1 = input.nextInt();
        
        System.out.print("2.Sayıyı Giriniz: ");
        int s2 = input.nextInt();
        
        int toplam = 0;
        int c = 0;
        while(c<s2){
            c++;
            toplam = toplam + s1;
        }
        System.out.println(toplam);
    }
    
}

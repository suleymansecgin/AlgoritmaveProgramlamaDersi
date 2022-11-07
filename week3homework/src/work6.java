/*
adım1:Başla
adım2:Klavyeden bir sayı gir.
adım3:toplam = 0
adım4:i = 1
adım5: Eğer i>n ise git adım9
adım6:toplam = toplam*i*i;
adım7:i++
adım8:yazdır toplam
adım9:bitir

 */
import java.util.Scanner;
public class work6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int n = input.nextInt();
        
        int toplam = 0;
        int i=1;
        
        while(i<=n){
            toplam += (int) Math.pow(i, 2);
            
            i++;
        }
        System.out.println(toplam);

    }
    
}

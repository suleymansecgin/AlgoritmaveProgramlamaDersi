/*
adım1: Başla
adım2: Klavyeden n sayısı al
adım3: t1=0,t2=0,t3=0
adım4: i=1;i<=n;i++
adım5: t1=t1+i
adım6: yazdır t1
adım7: Eğer n%i=0 değil ise git adım10
adım8: t2 = i + t2
adım9: yazdır t2
adım10: t3 = i + t3
adım11: yazdır t3
adım12: Bitir
 */
import java.util.Scanner;
public class work6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("n Sayısı Giriniz: ");
        int n = input.nextInt();
        
        int t1=0, t2=0, t3=0;
        for (int i = 1; i <= n; i++) {
            t1 += i;
            if (i%2==0) {
                t2 += i;
            }else{
                t3 += i;
            }
        }
        System.out.println("1'den "+n+"'ye kadar olan sayıların toplamı: " +t1);
        System.out.println("1'den "+n+"'ye kadar olan çift sayılan toplamı: "+t2);
        System.out.println("1'den "+n+"'ye kadar olan tek sayılan toplamı: "+t3);        
    }
    
}

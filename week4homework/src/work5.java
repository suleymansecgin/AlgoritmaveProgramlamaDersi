/*
adım1:Başla
adım2:klavyeden a sayısı al
adım3:i=1;i<=a;i++
adım4:Eğer a%i==0 değil ise git adım 3
adım5:Yazdır i
adım6: Bitir
 */
import java.util.Scanner;
public class work5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("a sayısı girin: ");
        int a = input.nextInt();
        
        for (int i = 1; i <= a; i++) {
            if (a%i==0) {
                System.out.println(i);
            }
        }
    }
    
}

/*
adım1: Başla
adım2: klavyeden n ve r girdisi al
adım3: C(n,r) = (n!/(r*(n-r)!)
adım4: n = 1, r = 1, (n-r) =1
adım5: i=1;,i<=n;i++
adım6: n *= i;
adım7: i=1; i<=r;i++;
adım8: r *= i;
adım9: i=1;i<=(n-r);i++;
adım10: n-r =* i
adım11: yazdır c(n,r)
adım12: Bitir.
 */
import java.util.Scanner;
public class work4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("C(n,r) = n!/(r!*(n-r)!)");
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        
        System.out.print("Klavyeden bir n sayısı giriniz: ");
        int n = input.nextInt();
        
        System.out.print("Klavyeden bir r sayısı giriniz: ");
        int r = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            f1 *= i ;
        }
        for (int i = 1; i <= r; i++) {
            f2 *= i;
        }
        for (int i = 1; i <= (n-r); i++) {
            f3 *= i;
        }
        
        int c = f1/(f2*f3);
        System.out.println(c);
        
        
    }
    
}

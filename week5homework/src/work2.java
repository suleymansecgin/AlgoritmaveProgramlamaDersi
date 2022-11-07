
/*
adım1: Başla
adım2: Klavyeden n sayısı gir.
adım3: a=0;a<=n;a++
adım4: b=0;b<=n;b++
adım5: Eğer 3*a+5*b = n değil ise git adım3
adım6: yazdır a,b
adım7: Bitir
 */

import java.util.Scanner;
public class work2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir Sayı Giriniz: ");
        int n = input.nextInt();
        
        for (int a = 0; a <= n; a++) {
            for (int b = 0; b <= n; b++) {
                if (3*a + 5*b == n) {
                    System.out.println(("a değeri: "+a+" b değeri: "+b));
                }
            }
        }
    }
    
}

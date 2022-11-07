/*
adım1: Başla
adım2: Klavyeden n sayısı al.
adım3: a=0;a<=n;a++
adım4: b=0;b<=n;b++
adım5: Eğer a*a+b*b = n değil ise git adım 3
adım6: Yazdır a, b
adım7: Bitir
 */

import java.util.Scanner;
public class work1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Bir Sayı Giriniz: ");
        int n = input.nextInt();
        
        for (int a = 0; a <= n; a++) {
            for (int b = 0; b <= n; b++) {
                if (Math.pow(a, 2)+ Math.pow(b, 2) == n) {
                    System.out.println(("a sayısı: "+a +" b sayısı: "+b));
                }
            }
        }
    }
    
}

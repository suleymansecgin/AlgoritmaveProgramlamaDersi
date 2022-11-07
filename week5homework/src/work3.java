/*
adım1: Başla
adım2: i=5;i<0;i--
adım3: j=1;j<=i;j++
adım4: yazdır *
adım5: Bitir
 */

import java.util.Scanner;
public class work3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}

/*
adım1: Başla
adım2: int n
adım3: n>0 değilse git adım 8
adım4: kalan = n%10 
adım5: n = n/10
adım6: yazdır kalan
adım7: git adım 3
adım8: Bitir
 */
import java.util.Scanner;
public class work3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, kalan;
        System.out.print("Klavyeden bir n sayısı giriniz: ");
        n = input.nextInt();
        
        while(n>0){
            kalan = n%10;
            n = n/10;
            System.out.print(kalan);           
        }
    }    
}

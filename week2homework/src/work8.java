/*
adım1:Başla
adım2:Kullanıcıdan ax^2+bx+c denkleminin deltasını bulmak için a,b,c sayılarını iste.
adım3:Verilen değerlere göre işlemi yap.(delta=b^2-4*a*c)
adım4:Çıkan delta değerini ekrana yazdır.
adım5:Bitir
 */
import java.util.Scanner;
public class work8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("a:");
        int a = input.nextInt();
        System.out.println("b");
        int b = input.nextInt();
        System.out.println("c");
        int c = input.nextInt();
        
        double delta = b*b - 4*a*c;
        System.out.println("Delta Değeri: "+delta);

        
    }
    
}

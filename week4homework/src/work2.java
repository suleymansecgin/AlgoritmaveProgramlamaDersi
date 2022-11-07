/*
adım1:başla
adım2:int fx, int x
adım3:fx = x^2-5*x+3
adım4:Klavyeden x sayısı al
adım5:Eğer fx>0 ise yazdır fx>0 değil ise git adım 6
adım6:Eğer fx<0 ise yazdır fx<0 değil ise git adım 7
adım7:yazdır fx=0
adım8:Bitir
 */
import java.util.Scanner;
public class work2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int fx, x ;
        System.out.print("Klavyeden bir x değeri giriniz: ");
        x = input.nextInt();
        fx = (int) (Math.pow(x,2)-5*x+3);
        System.out.println("f(x)=x^2-5*x+3");

        if (fx<0){
            System.out.println("f(x)<0");
        } 
        else if (fx>0){
            System.out.println("f(x)>0");
        }
        else
            System.out.println("f(x)=0");
    }
    
}

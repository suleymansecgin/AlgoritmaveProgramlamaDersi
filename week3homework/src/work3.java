/*
adım1:Başla
adım2:Klavyeden üçgen için 3 kenar gir.
adım3:Üçgenin tanımlı olması için üçgen eşitsizliğini kullan.(|k1-k2|<=k3<=|k1+k2|)
adım4:Verilen kenarlara göre üçgenin cinsini belirle.(Eşkenar,İkizkenar,Çeşitkenar)
adım5:Çıkan sonucu ekrana yazdır.
adım6:Bitir
 */
import java.util.Scanner;
public class work3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("1.kenarı giriniz: ");
    int k1 = input.nextInt();
    
    System.out.print("2.kenarı giriniz: ");
    int k2 = input.nextInt();
    
    System.out.print("3.kenarı giriniz: ");
    int k3 = input.nextInt(); 
    
        if (!(Math.abs(k1-k2)<=k3 && Math.abs(k1+k2)>=k3) || !(Math.abs(k2-k3)<=k1 && Math.abs(k2+k3)>=k1 || !(Math.abs(k1-k3)<=k2 && Math.abs(k1+k3)>=k2))){
            System.out.println("Üçgen Belirtmez....");
        } else if (k1==k2 && k1==k3 && k2==k3) {
            System.out.println("Eşkenar Üçgen");
        } else if (k1==k2 && !(k1==k3) || k2==k3 && !(k1==k2) || k1==k3 && !(k1==k2)) {
            System.out.println("İkizkenar Üçgen");
        } else {
            System.out.println("Çeşitkenar Üçgen");
        }
    }
}

/*
adım1:Başla.
adım2:Kullanıcıdan hesaplanacak dereceyi iste.
adım3:Gerekli işlemleri yap.(radyan=derece*3.14/180)(grad=derece*200/180)
adım4:Çıkan sonuçları ekrana yazdır.
adım5:Bitir.
*/

import java.util.Scanner;
public class work2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dereceyi Giriniz:");
        double derece = input.nextDouble();
        
        double radyan = derece * 3.14 / 180;
        double grad = derece * 200 / 180;
        
        System.out.println("Radyan: "+radyan +" " +"Grad:"+grad);

    }
    
}

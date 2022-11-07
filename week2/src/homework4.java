//Adım1=Başla
//Adım2=Kullanıcıdan cisme ait kütle değeri al
//Adım3=Kullanıcıdan cisme ait hız değerini al
//Adım4=Kullanıcıdan cismin yerden yüksekliğini değerini al
//Adım5=Potansiyel enerji=m*10*h
//Adım6=Hesap sonucunu yazdır
//Adım7=Kinetik enerji=1/2*m*V^2
//Adım7=Hesap sonucunu yazdır
//Adım8=Bitir

import java.util.Scanner ;
 public class homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner (System .in);
        System .out.println("Cisme ait kütle değerini giriniz:");
        double m=input.nextDouble();
        System .out.println("Cisme ait hız değerini giriniz:");
        double V =input.nextDouble();
        System.out.println("Cismin yüksekliğini giriniz:");
        double h=input.nextDouble();
        double potansiyelenerji  =(m*10*h );
        double kinetikenerji  =(m*V*V)/2;
        
        System.out.println("Hesaplanan potansiyel enerji:"+potansiyelenerji+ " ve Hesaplanan kinetik enerji:" +kinetikenerji);
        
        
        
        
                
        
               
        
    }
    
}

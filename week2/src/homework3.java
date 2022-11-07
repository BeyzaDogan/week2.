//Adım1=Başla
//Adım2=Kullanıcıdan küre için yarıçapı al
//Adım3=Hacim=4/3*(π*r^3)
//Adım4=Çıkan hacmi yazdır
//Adım5=Alan=4π*r^2
//Adım6=Çıkan alanı yazdır
//Adım7=Bitir

import java.util.Scanner ;
public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System .in);
         System .out.println("Lütfen küreye ait yarıçapını giriniz:");
        double r = input.nextDouble() ;  
        double hacim  =4/3*(Math.PI*r*r*r);
        double alan =(4*Math.PI*r*r) ;
        
        System.out.println("Hesaplanan küre hacim:"+hacim+"ve Hesaplanan küre alan:"+alan) ;
         
     
        
         
     
        
    }
    
}

//Adım1=Başla
//Adım2=Kullanıcıdan daireye ait yarıçap al
//Adım3=Dairenin çevresi=2*π*r
//Adım4=Dairenin alanı=π*r*r
//Adım5=Hesaplanan çevre,alan yazdır
//Adım6=Bitir

import java.util.Scanner ;
public class homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System .in);
        System.out.println("Daireye ait yarıçapı giriniz:");
        double r=input.nextDouble();
        double cevre=2*(Math.PI*r);
        double alan=(Math.PI*r*r);
        
        System.out.println("Hesaplanan çevre:"+cevre+"ve Hesaplanan alan:"+alan);
        
                
        
        
                

    }
    
}

//Adım1=Başla
//Adım2=Kullanıcıdan bir adet derece cinsinden açı al
//Adım3=radyan=derece cinsinden aldığın açı*(π/180)
//Adım4=Çıkan değeri yazdır
//Adım5=1 grad =derece *0.9 al
//Adım6=Çıkan değeri yazdır
//Adım7=Bitir

import java.util.Scanner ;
public class homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner (System .in);
         System .out.println("Derece cinsinden bir açı giriniz:");
         double derece =  input.nextDouble();
         double radyan= derece*(Math.PI/180);//3.141592653589793
         double grad= derece*0.9 ;
         
     System.out.println("Hesaplanan radyan:"+radyan+"ve Hesaplanan grad:"+grad) ;
     
       }
    
}
     
         
          
         
         
         

         

        
    


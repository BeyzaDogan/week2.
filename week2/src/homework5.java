//Adım1=Başla
//Adım2=Kullanıcıdan bir adet akım değeri al
//Adım3:Kullanıcıdan bir adet direnç değeri al
//Adım4=E=Akım*Direnç
//Adım5=Hesaplanan değeri yazdır
//Adım6=Bitir


import java.util.Scanner ;
 public class homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System .in);
         System.out.println("İletkenin üzerinden geçen akım değerini giriniz:");
         double I=input.nextDouble() ;
         System.out.println("İletkene ait direnç değerini giriniz:");
         double R =input.nextDouble();
         double E =I*R;
         
         System.out.println("Hesaplanan gerilim:"+E);
         
                 

        
        
    }
    
    
}

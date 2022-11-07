///Adım1=Başla
//Adım2=Kullanıcıdan üçgene ait bir adet kenar uzunluğu al
//Adım3=Kullanıcıdan o kenara ait yüksekliği al
//Adım4=alan=kenar uzunluğu*yükseklik/2
//Adım5=Hesaplanan değeri yaz
//Adım6=Bitir



import java.util.Scanner ;
public class homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System .in);
        System .out.println("Üçgeninizin bir adet kenar uzunluğunu giriniz:");
        double a =  input.nextDouble(); 
        System .out.println("Lütfen seçtiğiniz kenara ait yüksekliği giriniz:");
        double h=input.nextDouble(); 
        double ucgenınalan = a*h/2 ;
        
        System.out.println("Hesaplanan alan:"+ucgenınalan);
        
        
        
        
    }
    
}

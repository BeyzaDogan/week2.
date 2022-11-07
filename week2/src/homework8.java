//Adım1=Başla
//Adım2=Kullanıcadan dikdörtgene ait kısa kenar alın
//Adım3=Kullanıcıdan dikdörtgenin uzun kenarını isteyin
//Adım4=Çevre=2*(kısa kenar+uzun kenar)
//Adım5=Sonucu yazdır
//Adım6=Alan=kısa kenar*uzun kenar
//Adım7=Sonucu yazdır
//Adım8=Bitir
import java.util.Scanner ;

public class homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System .in);
        System.out.println("Dikdörtgenin kısa kenarını giriniz:");
        int a =input.nextInt();
        System.out.println("Dikdörtgenin uzun kenarını giriniz:");
        int b =input.nextInt();
        int cevre=2*(a+b);
        int alan=a*b;
        
        System.out.println("Dikdörtgenin çevre:"+cevre+" Dikdörtgenin alan:"+alan);
        
                
        

    }
    
}

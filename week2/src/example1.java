/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/import java.util.Scanner; // javanın util kütüphanesine ait Scanner sınıfı;

/**
 *
 * @author Excalibur
 */
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input =new Scanner (System.in) ; 
    
    System.out.println ("Lütfen hesaplanmasını istediğiniz km giriniz:");
     int km = input.nextInt(); // Kullanıcıdan km aldık
     int m= km *1000;// km'den m' ye dönüşüm yaptık
    System.out.println ("Hesaplanan metre :" +m);
    
     
     
     
     
        
    }
    
}

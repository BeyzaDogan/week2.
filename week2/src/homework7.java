//Adım1=Başla
//Adım2=Kullanıcıdan boy uzunluğunu girmesini isteyin
//Adım3=Kullanıdan kilosunu girmesini isteyiniz
//Adım4=BKİ=kilo/boy*boy
//Adım5=çıkan değeri yazdır
//Adım6=BKİ<18 ise zayıf,BKİ<25 ise normal,BKİ<30 ise hafif şişman ,BKİ<35 ise şişman BKİ>35 ise obez yazdır
//Adım7=Bitir

import java.util.Scanner ;

public class homework7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System .in);
        System.out.println("Boy uzunluğunu giriniz:");
        double boy=input.nextDouble();
        System.out.println("Kilo değerinizi giriniz:");
        double kilo=input.nextDouble();
        double BKİ=kilo/(boy*boy);
         
        System.out.println("Beden kitle indeksiniz:"+BKİ);
        
        if (BKİ<18) 
        System.out.println("Zayıf");
        
        else if (BKİ<25)
        System.out.println("Normal");
        
        else  if (BKİ<30)
        System.out.println("Hafif şişman");
        
        else if(BKİ<35)
        System.out.println("Şişman");
        
        else
        System.out.println("Obez");
        
        
               
           
        
        
        
                
                
        
        
        

    }
    
}




import java.util.Scanner ;
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System .in);
        System .out.println("Lütfen birinci sayıyı giriniz:");
        int a =  input.nextInt();  
        System .out.println("Lütfen ikinci sayıyı girin:");
        int b = input.nextInt();
        System .out.println("Lütfen üçüncü sayıyı girin:");
        int c=input.nextInt();
        int toplam =a+b+c;
        int carpim = a*b*c ;
        double ort=(double)toplam /3;
        
     System.out.println("ortalama:"+ort+",Toplam:,"+toplam+" ve Çarpım:"+carpim);
     
       
                
                
    }
    
}

import java.util.Scanner;
public class Task6 {
     public static void main(String[] args) {
        final float usd =74.3f;
        final float gbp =94.5f;
        final float eur =85.37f;
     Scanner obj=new Scanner(System.in);   
     System.out.println("Enter the source currency(USD/GBP/EUR):");
     String str=obj.next();
     System.out.println("Enter the amount:");
     int a=obj.nextInt();
     switch(str){
         case "GBP":{
          float INR= gbp*a;
          System.out.println("The Exchange rate for "+a+" GBP is : "+INR+" INR");
          break;
                }
                
         case "EUR":{
          float INR= eur*a;
          System.out.println("The Exchange rate for "+(float)a+" EUR is : "+INR+" INR");
          break;
                }
                
         case "USD":{
          float INR= usd*a;
          System.out.println("The Exchange rate for "+a+" USD is : "+INR+" INR");
          break;
                }        
    }   
 }
}

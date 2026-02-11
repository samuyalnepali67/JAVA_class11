import java.util.Scanner;
public class  Numberguessing {
   int num;
   int num2;
 

   Numberguessing(int num){
    this.num = num;


   }
   
   void check(){
       Scanner input = new Scanner(System.in);
       boolean check = true;
        int attempt =1;

     while(check){
        System.out.println("Enter the number");
        num2 = input.nextInt();

        if(num2>num){
            System.out.println("Your number " + num2 + " is greater");
            attempt++;
        }

        else if(num2<num){
            System.out.println("Your number " + num2 + " is smaller");
            attempt++;
        }
      
        else {
         System.out.println("Your guess is correct ");
            System.out.println("Your guessed in  " + attempt + " attempt");
         check = false;

         
        
      }

    
     
     }
   }

   public static void main(String[] aargs){
 
     Numberguessing ng = new Numberguessing(5);
     ng.check();

   }
}
        
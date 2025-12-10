import java.util.Scanner;


public class Table{
    public static void main(String[]args){

      Scanner input = new Scanner(System.in);

      System.out.println("Enter the number");
      int num = input.nextInt();

     for(int i=1;i<=10; i++){
      System.out.println( num * i);
     }
     input.close();
    }
}
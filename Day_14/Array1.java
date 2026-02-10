import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[]=new int[4];
    System.out.println("enter a input ");
     for(int i=0;i<a.length;i++){
         a[i]=sc.nextInt();   
     }
    System.out.println("array elements are ");
    for(int i=0;i<a.length;i++){
        System.out.println( a[i] );
    }
    }
}
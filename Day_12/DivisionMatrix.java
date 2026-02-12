import java.util.Scanner;
public class DivisionMatrix {
    public static void main(String[] args){
         
        Scanner input = new Scanner(System.in);
        int matrixA[][] = new int[2][3];
        int matrixB[][] = new int[2][3];
        int division[][] = new int[2][3];


        System.out.println("Enter elements of first matrix:");
        for(int i=0; i<2; i++){ 
            for(int j=0; j<3; j++){
                matrixA[i][j] = input.nextInt();
            }
        }


        System.out.println("Enter elements of second matrix:");
        for(int i=0; i<2; i++){ 
            for(int j=0; j<3; j++){
                matrixB[i][j] = input.nextInt();
            }
        }   


        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                if(matrixB[i][j] != 0){
                    division[i][j] = matrixA[i][j] / matrixB[i][j];
                } else {
                    System.out.println("Division by zero is not possible ");
                  
                }
            }
        }

        
        System.out.println("Division of the two matrices:");
        for(int i=0; i<2; i++){ 
            for(int j=0; j<3; j++){
                System.out.print(division[i][j] + " ");
            }
            System.out.println();
        }
    }
}
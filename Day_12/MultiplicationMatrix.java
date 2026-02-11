import java.util.Scanner;

public class MultiplicationMatrix {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int matrixA[][] = new int[2][3];
        int matrixB[][] = new int[3][2];
        int result[][] = new int[2][2];

        System.out.println("Enter elements of first matrix (2x3):");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix (3x2):");
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                matrixB[i][j] = input.nextInt();
            }
     }
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<3; k++){
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Multiplication of the two matrices:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

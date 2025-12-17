import java.util.Scanner;

 class Guess {
    static int secrectNumber = 24;
    static int userInput;
    static Scanner sc = new Scanner(System.in);

    Guess(int SecNum, int userInput){
        secrectNumber = SecNum;
        this.userInput = userInput;
    }
    
    static void getNumber(){
        System.out.print("Enter Your Guess Here : ");
        userInput = sc.nextInt();
     }

     public static void main(String [] args) {
        boolean working = true;

        System.out.println(" Welcome to Number Guessing Game ");
        System.out.println("----------------------------------");
        System.out.println("Guess a Number between 1 to 100");

        getNumber();

        while(working){
            if(secrectNumber == userInput){
                System.out.println("You Guessed it Right");
                working = false;

            } else if(secrectNumber > userInput){
                System.out.println("Your Guess is Low");
                getNumber();

            } else if(secrectNumber < userInput){
                System.out.println("Your Guess is High");
                getNumber();
            }
            else {
                System.out.println("Invalid Input");
                getNumber();
            }
            
        }
    }
 }

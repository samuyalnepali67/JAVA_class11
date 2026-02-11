import java.util.Scanner;

 class Guess {
    static int guessingNum = 24;
    static int userInput;
    static Scanner sc = new Scanner(System.in);

    Guess(int SecNum, int userInput){
        guessingNum = SecNum;
        this.userInput = userInput;
    }
    
    static void getNumber(){
        System.out.print("Enter Your Guess Here : ");
        userInput = sc.nextInt();
     }

     public static void main(String [] args) {
        boolean working = true;

        System.out.println(" Welcome to Number Guessing Game ");
        System.out.println("Guess a Number between 1 to 100");

        getNumber();

        while(working){
            if(guessingNum == userInput){
                System.out.println("You Guessed it Right");
                working = false;

            } else if(guessingNum > userInput){
                System.out.println("Your Guess is Smaller");
                getNumber();

            } else if(guessingNum < userInput){
                System.out.println("Your Guess is Grater");
                getNumber();
            }
            else {
                System.out.println("Invalid Input");
                getNumber();
            }
            
        }
    }
 }
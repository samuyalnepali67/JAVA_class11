package day_6;

import java.util.Scanner;

public class CLASSwork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a letter:");
        String alpha = input.nextLine().toLowerCase();  
        
        if (alpha.equals("a") || alpha.equals("e") || alpha.equals("i") || 
            alpha.equals("o") || alpha.equals("u")) {

            System.out.println("The entered letter is a vowel");
        } else {
            System.out.println("The entered letter is a consonant");
        }
    }
}
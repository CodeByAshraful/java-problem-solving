/*
 Author: Ashraful Khan
 Problem: Number Guessing Game
 Description: User guesses a random number between 1–100.
*/
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do{
            System.out.println("Guess my number : ");
            userNumber = sc.nextInt();
            if(myNumber==userNumber)
            {
                System.out.println("WOHOO..CORRECT NUMBER");
                break;
            }
            else if(myNumber<userNumber)
            {
                System.out.println("Number is to large");
            }
            else {
                System.out.println("Number is to small");
            }
        }while(userNumber>=0);
        System.out.println("My number was : ");
        System.out.println(myNumber);
    }
}
/*
 Problem: Number Guessing Game

 The user has to guess a random number between 1 and 100.

 Rules:
 1. If the guessed number is correct, display:
    "Correct number."

 2. If the guessed number is smaller than the generated number, display:
    "Your number is less."

 3. If the guessed number is larger than the generated number, display:
    "Your number is large."

 4. If the user enters a negative number, the program will terminate immediately.
*/


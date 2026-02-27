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

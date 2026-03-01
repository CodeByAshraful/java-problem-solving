import java.util.Scanner;
public class printFactorial {
    public static void factorial(int num)
    {
        if(num<0)
        {
            System.out.println("Invalid Number!");
        }
        int fact = 1;
        for(int i=num; i>=1; i--)
        {
            fact = fact*i;
        }
        System.out.print("Factorial is : ");
        System.out.println(fact);
        return;
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int num = sc.nextInt();
       factorial(num);
    }

}
/*
Example of factorial : 
5!
= 5 × 4 × 3 × 2 × 1

Step view:

5! → 5 × 4!
        ↓
      5 × 4 × 3!
              ↓
            5 × 4 × 3 × 2!
                        ↓
                      5 × 4 × 3 × 2 × 1!
                                      ↓
                                    5 × 4 × 3 × 2 × 1
                                              ↓
                                             120
 */

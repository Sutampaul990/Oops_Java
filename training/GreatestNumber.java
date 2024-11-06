import java.util.*;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three number : ");  // Taking 3 inputs
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b) {   // Checking for first condition
            if (a >= c)
                System.out.println("Greatest number between " + a + ", " + b + " & " + c + " : " + a); // nested condition checking

            else
                System.out.println("Greatest number between " + a + ", " + b + " & " + c + " : " + c);

        } else {
            if (b >= c)
                System.out.println("Greatest number between " + a + ", " + b + " & " + c + " : " + b);
            else
                System.out.println("Greatest number between " + a + ", " + b + " & " + c + " : " + c);
        }
    }
}

/*
 * OUTPUT :
 * Enter the three number : 10 15 20
 * Greatest number between 10, 15 & 20 : 20
 */
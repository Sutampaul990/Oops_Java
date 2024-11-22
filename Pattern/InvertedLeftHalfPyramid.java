
/*
 Enter rows : 5
*****
 ****
  ***
   **
    *
12345
 1234
  123
   12
    1
ABCDE
 ABCD
  ABC
   AB
    A
 */
import java.util.*;

public class InvertedLeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++)
                System.out.print(" ");
            for (int j = n - i - 1; j >= 0; j--)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++)
                System.out.print(" ");
            for (int j = 0; j <= n - i - 1; j++)
                System.out.print(j + 1);
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++)
                System.out.print(" ");
            for (int j = 0; j <= n - i - 1; j++)
                System.out.print((char) (65 + j));
            System.out.println();
        }
    }
}

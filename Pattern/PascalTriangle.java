/*
 Enter rows : 5
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1 
 */

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // inner loop 1 for leading white spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int C = 1; // coefficient

            // inner loop 2 for printing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(C + " ");
                C = C * (i - k) / k;
            }
            System.out.println();
        }
    }
}

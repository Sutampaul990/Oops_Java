/*
 Enter rows : 5
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
         1
       1 2 3
     1 2 3 4 5 
   1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8 9
         A
       A B C
     A B C D E
   A B C D E F G
 A B C D E F G H I
 
 */

import java.util.*;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (n - i) - 1; j++)
                System.out.print(" ");
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print("* ");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (n - i) - 1; j++)
                System.out.print(" ");
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print((k + 1) + " ");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (n - i) - 1; j++)
                System.out.print(" ");
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print((char) (65 + k) + " ");
            System.out.println();
        }
    }
}


/*
 Enter rows : 5
*****
****
***
**
*
 */
import java.util.*;

public class InvertedRightHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}


/*
 Enter rows : 4
1
23
456
78910
A
BC
DEF
GHIJ
 */
import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = sc.nextInt();

        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((k++));
            }
            System.out.println();
        }

        int l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + (l++)));
            }
            System.out.println();
        }
    }
}

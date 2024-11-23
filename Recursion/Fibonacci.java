import java.util.*;

public class Fibonacci {
    /*
     * static int fibo(int n) {
     * if (n == 0 || n == 1)
     * return n;
     * return fibo(n - 1) + fibo(n - 2);
     * }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last term of fibonacci series : ");
        int n = sc.nextInt();
        // int fibo = fibo(n);
        System.out.print("Fibonacci Series : ");
        int a = 0, b = 1;
        System.out.print(a + "\t" + b + "\t");
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            System.out.print(sum + "\t");
            a = b;
            b = sum;
        }
        // System.out.print("Result of " + n + "th term : " + fibo);
    }
}

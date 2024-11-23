import java.util.*;

public class SumOfNum {
    static int summation(int n) {
        if (n == 1)
            return 1;
        return n + summation(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number : ");
        int n = sc.nextInt();
        int sum = summation(n);
        System.out.print("Result of sum upto " + n + " : " + summation(n));
    }
}

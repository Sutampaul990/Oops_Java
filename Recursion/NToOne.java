import java.util.Scanner;

public class NToOne {
    static void nto1(int n) {
        if (n == 0)
            return;
        System.out.print(n + "\t");
        nto1(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number : ");
        int n = sc.nextInt();
        nto1(n);
    }
}

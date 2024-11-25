import java.util.Scanner;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;
        int maxi = 0;

        // Brute Force Approach...
        /*
         * for (int i = 0; i < n; i++) {
         * for (int j = i; j < n; j++) {
         * int sum = 0;
         * for (int k = i; k <= j; k++)
         * sum += arr[k];
         * maxi = Math.max(maxi, sum);
         * }
         * }
         */

        // Better Approach...
        /*
         * for (int i = 0; i < n; i++) {
         * int sum = 0;
         * for (int j = i; j < n; j++) {
         * sum += arr[j];
         * maxi = Math.max(maxi, sum);
         * }
         * }
         */

        // Optimal Approach...
        int sum = 0;
        int ansStart = 0, ansEnd = 0, start = 0;
        for (int i = 0; i < n; i++) {
            if (sum == 0)
                start = i;
            sum += arr[i];
            if (sum < 0)
                sum = 0;
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
        }
        System.out.println("SubArray occurances : " + ansStart + " to " + ansEnd);
        System.out.println("Maximum sub array sum : " + maxi);
        System.out.print("SubArray : ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

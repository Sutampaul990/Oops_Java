import java.util.Scanner;

class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { -1, 1, 1 };
        int n = arr.length;
        int maxLen = 0, k = 1;

        /*
         * System.out.println("Printing the sub array : ");
         * for (int i = 0; i < n; i++) {
         * int sum = 0;
         * for (int j = i; j < n; j++) {
         * sum += arr[j];
         * if (sum == givenSum)
         * maxLen = Math.max(maxLen, j - i + 1);
         * }
         * 
         * }
         * System.out.print(maxLen);
         */

        // Using two pointer concept
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k)
                maxLen = Math.max(maxLen, right - left + 1);
            right++;
            if (right < n)
                sum += arr[right];
        }
        System.out.print("Maximum Length : " + maxLen);
    }
}
import java.util.*;

public class ArraySortedOrNot {
    /*
     * static boolean sortedOrNot(int[] arr, int i, int n) {
     * if (i >= n)
     * return true;
     * if (arr[i] > arr[i + 1])
     * return false;
     * return sortedOrNot(arr, i + 1, n);
     * }
     */

    static boolean isSorted(int[] arr, int n) {
        if (n == 0 || n == 1)
            return true;
        return arr[n - 1] >= arr[n - 2] && isSorted(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // System.out.print("Array is sorted or Not : " + sortedOrNot(arr, 0, n - 1));
        System.out.print("Array is sorted or Not : " + isSorted(arr, n));
    }
}

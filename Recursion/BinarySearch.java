import java.util.*;

public class BinarySearch {
    public static int binarySearch(int[] arr, int low, int high, int search) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == search)
                return mid;
            else if (arr[mid] < search)
                return binarySearch(arr, mid + 1, high, search);
            return binarySearch(arr, low, mid - 1, search);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the search element : ");
        int search = sc.nextInt();

        int bs = binarySearch(arr, 0, n - 1, search);
        System.out.print("Result of position of (" + search + ") : " + bs);
    }
}

import java.util.*;

public class BubbleSort {

    static void swapEle(int arr[], int a, int b) { // Swap function
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner class
        System.out.print("Enter the length of the Array : ");
        int n = sc.nextInt(); // Taking inputs for length of the array
        int arr[] = new int[n];

        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Present Array : "); // Printing the user given array before sorting
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "\t");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { // Outer loop
                if (arr[j] > arr[j + 1]) { // Inner loop
                    swapEle(arr, j, j + 1); // Swapping using function and 3rd variable
                }
            }
        }

        System.out.println();
        System.out.print("Sorted Array : "); // After sorting printing Array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "\t");
    }
}

/*
 * OUTPUT:
 * Enter the length of the Array : 5
 * Enter the elements : 9 5 6 0 2
 * Present Array : 9 5 6 0 2
 * Sorted Array : 0 2 5 6 9
 */
import java.util.*;

public class Pattern_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the no of rows : "); // Taking input for number of rows
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {          // Outer loop
            for (int j = 1; j <= i; j++) {      // Inner loop
                System.out.print("*" + "\t");
            }
            System.out.println();               // For next line
        }
    }
}

/*
Enter the no of rows : 5
 *
 * *
 * * *
 * * * *
 * * * * *
*/
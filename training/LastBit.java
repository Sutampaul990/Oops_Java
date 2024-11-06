import java.util.*;

public class LastBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer : "); // Taking input for integer
        int n = sc.nextInt();

        int lastBit = (n & 1); // Last bit calculating with AND Gate
        System.out.println("Last Bit of " + n + " : " + lastBit);
    }
}

/*
 * OUTPUT :
 * Enter Integer : 2
 * Last Bit of 2 : 0
 */

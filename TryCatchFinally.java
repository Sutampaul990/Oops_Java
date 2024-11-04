/* Try Catch Finally */

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Learn Coding...");
            int a=20,b=2,c;
            c = a / b;
            System.out.println(c);
            System.out.println("Something special");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by Zero...");
        }
        finally{
            System.out.println("Finally block executed...");
        }
        System.out.println("Main method ended...");
    }
}

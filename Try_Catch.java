public class Try_Catch {
    public static void main(String[] args) {
        System.out.println("Main method started...");
        int a=10,b=0,c;
        try {
            c = a/ b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by Zero...");
        }

        System.out.println("Main method ended...");
    }
}

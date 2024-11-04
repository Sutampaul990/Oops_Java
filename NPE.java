// NULL POINTER EXCEPTION

public class NPE {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println(str.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Null can't be casted...");
        }
    }
}

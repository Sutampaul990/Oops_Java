public class method_Overloading {
    int add() {
        int a = 10, b = 20, c;
        c = a + b;
        return c;
    }

    void add(int x, int y) {
        int c;
        c = x + y;
        System.out.println(c);
    }

    void add(double x, double y) {
        double c;
        c = x + y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        method_Overloading ref = new method_Overloading();
        int add = ref.add();
        ref.add(5, 10);
        ref.add(50.05, 10);
        System.out.println(add);
    }
}

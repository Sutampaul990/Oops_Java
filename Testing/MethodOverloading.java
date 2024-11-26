public class MethodOverloading {
    public int sum(int x, int y) {
        return x + y;
    }

    public int sum(int x, int y, int z) {
        return x + y + z;
    }

    public double sum(double x, double y) {
        return x + y;
    }

    public String sum(String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        System.out.println(m.sum(1.2, 3.6));
        System.out.println(m.sum(1, 2));
        System.out.println(m.sum(1, 3, 2));
        System.out.println(m.sum("Sutam", " Paul"));
    }
}

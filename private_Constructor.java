class A {

}

public class private_Constructor {
    int a;
    double b;
    String c;

    private private_Constructor() {
        a = 10;
        b = 30.55;
        c = "Sutam";
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        private_Constructor cpy = new private_Constructor();
    }
}

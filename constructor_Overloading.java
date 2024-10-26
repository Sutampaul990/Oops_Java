class A {
    int a;
    double b;
    String ch;

    A() {
        a = 100;
        b = 50.98;
        ch = "Sutam";
    }

    A(int x) {
        a = x;
    }

    A(String str) {
        ch = str;
    }
}

public class constructor_Overloading {
    public static void main(String[] args) {
        A r1 = new A();
        A r2 = new A(25);
        A r3 = new A("Sutam");
        System.out.println(r1.a+" "+r1.b+" "+r1.ch);
        System.out.println(r2.a);
        System.out.println(r3.ch);
    }
}

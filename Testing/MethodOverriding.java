class A {
    public void show() {
        System.out.println("Parent class");
    }
}

class B extends A {
    //@Override
    public void show() {
        // super.show();
        System.out.println("Child class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
class Parent {
    public void show() {
        System.out.println("This is a Parent class...");
    }
}

class Subclass1 extends Parent {
    @Override
    public void show() {
        System.out.println("This is subclass 1");
        ;
    }
}

class Subclass2 extends Parent {
    @Override
    public void show() {
        System.out.println("This is subclass 2");
        ;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Parent p1;
        p1 = new Subclass1();
        p1.show();
        p1 = new Subclass2();
        p1.show();
    }
}

interface A {
    void show();
}

interface B {
    void Disp();
}

class Multiple_Inheritance implements A, B {
    public void show() {
        System.out.println("Interface A...");
    }

    public void Disp() {
        System.out.println("Interface B...");
    }

    public static void main(String args[]) {
        Multiple_Inheritance m = new Multiple_Inheritance();
        m.show();
        m.Disp();
    }
}

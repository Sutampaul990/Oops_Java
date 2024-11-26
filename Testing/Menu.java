class FinalDemo {
    final int MAX_VALUE = 100;

    public final void display() {
        System.out.println("Max value : " + MAX_VALUE);
    }

    public void greet() {
        System.out.println("This is a final class..");
    }
}

public class Menu {
    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        //fd.MAX_VALUE = 120;
        System.out.println("Final variable : " + fd.MAX_VALUE);
        fd.display();
        fd.greet();
    }
}

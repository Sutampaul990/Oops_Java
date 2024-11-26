/*
interface Animal {
    public void animalSound();

    public void sleep();
}

 * class Pig implements Animal{
 * public void animalSound(){
 * System.out.println("Pig says : Wee wee...");
 * }
 * public void sleep(){
 * System.out.println("Zzz");
 * }
 * }
 */

interface First {
    public void method();
}

interface Second {
    public void myOtherMethod();
}

class DemoClass implements First, Second {
    public void method() {
        System.out.println("Some text...");
    }

    public void myOtherMethod() {
        System.out.println("Some other methods...");
    }

    public void sleep() {
        System.out.println("Zzz...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        DemoClass dm = new DemoClass();
        dm.method();
        dm.myOtherMethod();
    }
}

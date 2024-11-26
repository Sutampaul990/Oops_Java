class Animal {
    public void eat() {
        System.out.println("Parent Animal class is called...");
    }
}

class Tiger extends Animal {
    public void show() {
        super.eat();
        System.out.println("Tigers are Non-vegetarian..");
    }
}

class Dear extends Animal {
    public void show() {
        super.eat();
        System.out.println("Dears are vegetarian...");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.show();
        Dear d = new Dear();
        d.show();
    }
}

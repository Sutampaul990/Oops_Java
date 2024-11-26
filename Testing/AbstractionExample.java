abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " barks...");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " meows...");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Animal a;

        a = new Dog("Tom");
        a.makeSound();

        a = new Cat("Tommy");
        a.makeSound();
    }
}

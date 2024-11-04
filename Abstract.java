abstract class Animal{
    Animal(){
        System.out.println("All animals...");
    }
    public abstract void sound();
}
class Dog extends Animal{
    Dog(){
        super();
    }
    public void sound(){
        System.out.println("Dog is barking");
    }
}
class Lion extends Animal{
    Lion(){
        super();
    }
    public void sound(){
        System.out.println("Lion is roaring");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l = new Lion();
        d.sound();
        l.sound();
    }
}

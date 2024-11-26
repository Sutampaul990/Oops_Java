abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzzz...");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("Pig says : Wee wee...");
    }
}
public class ExampleAbstraction {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

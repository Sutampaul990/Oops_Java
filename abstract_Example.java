/*
 * abstract class Animal{
 * public abstract void sound();
 * }
 * 
 * class Dog extends Animal{
 * public void sound(){
 * System.out.println("Dog is Barking...");
 * }
 * }
 * class Lion extends Animal{
 * public void sound(){
 * System.out.println("Lion is Roaring...");
 * }
 * }
 * 
 * public class abstract_Example {
 * public static void main(String args[]){
 * Animal t = new Lion();
 * t.sound();
 * }
 * }
 */

 abstract class Animal{
    private String name;
    Animal(String name){
        this.name = name;
    }
    abstract void make_Sound();
    String getName(){
        return name;
    }
 }

 class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    void make_Sound(){
        System.out.println(getName() + " bark");
    }
 }
 class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    void make_Sound(){
        System.out.println(getName() + " meows");
    }
 }

 class abstract_Example{
    public static void main(String[] args) {
        Animal myDog = new Dog("Tommy");
        Animal myCat = new Cat("Pushy");

        myDog.make_Sound();
        myCat.make_Sound();
    }
 }

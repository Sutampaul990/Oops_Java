class A{
    void print(){
        System.out.println("Hello, I am a Super class...");
    }
}
class B extends A{
    void print(){
        System.out.println("Method Overriding...");
        System.out.println("Hello, I amn't parent class...");
    }
    void show(){
        System.out.println("Hello, I am Sub class...");
    }
}
public class single_Inheritance {
    public static void main(String[] args) {
        B test = new B();
        test.print();
        //test.show();
    }
}

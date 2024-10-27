class one{
    void print(){
        System.out.println("I am a Parent Class...");
    }
}
class two extends one{
    void show(){
        System.out.println("I am a Intermediate class...");
    }
}
class three extends two{
    void display(){
        System.out.println("I am a derived sub class...");
    }
}
public class multiLevel_Inheritance {
    public static void main(String[] args) {
        three t = new three();
        t.print();
        t.show();
        t.display();
    }
}

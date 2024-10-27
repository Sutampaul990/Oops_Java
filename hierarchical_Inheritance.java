class A{
    void print_A(){
        System.out.println("class A");
    }
}
class B extends A{
    void print_B(){
        System.out.println("class B");
    }
}
class C extends A{
    void print_C(){
        System.out.println("class C");
    }
}
class D extends A{
    void print_D(){
        System.out.println("class D");
    }
}
public class hierarchical_Inheritance {
    public static void main(String[] args) {
        B obj_B = new B();
        obj_B.print_A();
        obj_B.print_B();

        C obj_C = new C();
        obj_C.print_A();
        obj_C.print_C();

        D obj_D = new D();
        obj_D.print_A();
        obj_D.print_D();
    }
}

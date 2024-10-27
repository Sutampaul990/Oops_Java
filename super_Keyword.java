class A{
    int a;
    A(){
        a = 10;
    }
}
class B extends A{
    int a;
    B(){
        System.out.println("Super class called... & a = "+super.a);
        super.a = 12;
        System.out.println("Super class variable changed in subclass... & a = "+super.a);
        a = 100;
        System.out.println("Sub class called.. & a = "+a);
    }
}
public class super_Keyword {
    public static void main(String[] args) {
        B test = new B();
    }
}

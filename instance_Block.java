class A{
    int a,b;
    void show(){
        a=60;b=100;
        System.out.println(a+" "+b);
    }
    A(){
        a=30;b=40;
        System.out.println(a+" "+b);
    }
    {
        a=10;b=20;
        System.out.println(a+" "+b);
    }
}
public class instance_Block {
    public static void main(String[] args) {
        A test = new A();
        test.show();
    }
}

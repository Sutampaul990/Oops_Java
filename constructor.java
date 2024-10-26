class A{
    int a;String str;
    /*
    A(){
        a = 2;
        str = null;
    }*/
    void show(){
        System.out.println(a+" "+str);
    }
}
public class constructor {
    public static void main(String[] args) {
        A ref = new A();
        ref.show();
    }
}

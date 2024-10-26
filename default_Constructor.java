class A{
    int a;String b;boolean c;
    /*
    A(){
        a = 100;
        b = "Sutam";
        c = true;
    }*/
    void display(){
        System.out.println(a+" "+b+" "+c);
    }
}

public class default_Constructor {
    public static void main(String[] args) {
        A ref = new A();
        ref.display();
    }
}

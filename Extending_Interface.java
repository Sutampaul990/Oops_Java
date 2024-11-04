interface Gill{
    void add();
}
interface Raj extends Gill{
    void sub();
}

class Ankit implements Raj{
    @Override
    public void add(){
        int a=10,b=50,c;
        c = a+b;
        System.out.println("Addition : "+c);
    }
    @Override
    public void sub(){
        int a=10,b=50,c;
        c = b-a;
        System.out.println("Subtraction : "+c);
    }
}

public class Extending_Interface {
    public static void main(String[] args) {
        Raj r = new Ankit();
        r.add();r.sub();
    }
}

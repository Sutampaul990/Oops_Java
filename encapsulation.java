class A{
    private int value; // Data hiding
    public void setValue(int x){
        value = x;
    }
    public int getValue(){
        return value;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        A r = new A();
        r.setValue(100);
        System.out.println(r.getValue());
    }
}

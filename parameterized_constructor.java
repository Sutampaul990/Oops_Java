
class Test{
    int a,b;
    Test(int x,int y){
        a = x;
        b = y;
    }
    void show(){
        System.out.println(a+ " " + b);
    }
}

public class parameterized_constructor {
    public static void main(String[] args) {
        Test t = new Test(100,200);
        t.show();
    }
}


class Test{
    int a,b;
    Test(int x,int y){
        a = x;
        b = y;
    }
    Test(int a,String b){
        System.out.println(a + " " +b);
    }
    Test(char ch){
        System.out.println(ch);
    }
    void show(){
        System.out.println(a+ " " + b);
    }
}

public class parameterized_constructor {
    public static void main(String[] args) {
        Test t1 = new Test(100,200);
        Test t2 = new Test(300,"Sutam");
        Test t3 = new Test('c');
        t1.show();
    }
}

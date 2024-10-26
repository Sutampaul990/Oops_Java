class Demo{
    int a = 10;
    String str = "Sutam";
    void show(){
        System.out.println(a+" "+str);
    }
}
class class_obj_example{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
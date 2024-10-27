public class this_Keyword {
    
    this_Keyword(){
        this(10);
    }
    this_Keyword(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        this_Keyword r = new this_Keyword();
    }
}

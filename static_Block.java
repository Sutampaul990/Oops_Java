public class static_Block {
    static_Block(){
        System.out.println("1. I am Sutam");   // Constructor
    }
    {
        System.out.println("2. I am Sutam");   // Instance Block
    }
    static{
        System.out.println("3. I am Sutam");   // Static Block
    }
    public static void main(String[] args) {
        static_Block test = new static_Block();
    }
}

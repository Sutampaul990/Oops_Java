class GFG {
    String name;
    int age;

    GFG(String name) {
        this.name = name;
    }

    GFG(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        GFG g1 = new GFG("Sutam Paul");
        GFG g2 = new GFG("Ritam", 21);
        System.out.println("Name : " + g1.name);
        System.out.println("Name : " + g2.name + ", age : " + g2.age);
    }
}
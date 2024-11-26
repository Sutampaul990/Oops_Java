class GFG {
    String name;
    int id;

    GFG(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        GFG gf = new GFG("Sutam", 01);
        System.out.println("Name : " + gf.name + ", id : " + gf.id);
    }
}

class Geek {
    String name;
    int id;

    Geek(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Geek(Geek obj) {
        this.name = obj.name;
        this.id = obj.id;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        System.out.println("First Object : ");
        Geek g1 = new Geek("Sutam", 101);
        System.out.println("Name : " + g1.name + ", Id : " + g1.id);

        System.out.println();

        Geek g2 = new Geek(g1);
        System.out.println(
                "Copy Constructor used Second Object");
        System.out.println("Name : " + g2.name + ", Id : " + g2.id);

    }
}

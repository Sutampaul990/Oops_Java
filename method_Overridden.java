class shape {
    void draw() {
        System.out.println("Can't say shape type...");
    }
}

class square extends shape {
    @Override
    void draw() {
        super.draw();
        System.out.println("square shape...");
    }
}

public class method_Overridden {
    public static void main(String[] args) {
        square r = new square();
        r.draw();
    }
}

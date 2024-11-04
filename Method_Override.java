abstract class Programming {
    public abstract void Developer();
}

class HTML extends Programming {
    @Override
    public void Developer() {
        System.out.println("Hyper Text Markup Language...");
    }
}

class Java extends Programming {
    @Override
    public void Developer() {
        System.out.println("Java Developer...");
    }
}

public class Method_Override {
    public static void main(String[] args) {
        HTML h = new HTML();
        h.Developer();
        Java j = new Java();
        j.Developer();
    }
}

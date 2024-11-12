class Book {
    private String title;
    private double price;

    // default constructor
    Book() {
    }

    // parameterized constructor
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Book - Title : " + title + " & price : " + price;
    }

}

public class Main {
    public static void main(String[] args) {

        // Instance using setter methods ...
        Book b1 = new Book();
        b1.setTitle("' What's in a Name? '");
        b1.setPrice(3210.50);

        System.out.println(b1.toString());

        // Instance using parameterized constructor...

        Book b2 = new Book("' The Psychology of Money '", 250);
        
        System.out.println(b2.toString());
    }
}

/*
 * OUTPUT :
 * Book - Title : ' What's in a Name? ' & price : 3210.5
 * Book - Title : ' The Psychology of Money ' & price : 250.0
 */
import java.util.Scanner;
/*
 * interface shape{
    double calculateArea();
}

class Circle implements shape{
    private double rad;
    Circle(double rad){
        this.rad = rad;
    }
    public double calculateArea(){
        return Math.PI * rad * rad;
    }
}

class Rectangle implements shape{
    private double length;
    private double width;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length * width;
    }
}

public class interfaceExample {
    public static void main(String[] args) {
        Circle myCircle = new Circle(100);
        Rectangle myRec = new Rectangle(10,20);

        System.out.println("Area of Circle : "+myCircle.calculateArea());
        System.out.println("Area of rectangle : "+myRec.calculateArea());
    }
}

 */


 /*
  * interface client{
    void input();
    void output();
 }
 class Developer implements client{
    String name; double salary;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username : ");
        name = sc.nextLine();

        System.out.print("Enter salary : ");
        salary = sc.nextDouble();
    }
    public void output(){
        System.out.println("Username : " +name + " & Salary : " + salary);
    }
 }

 class interfaceExample{
    public static void main(String[] args) {
        Developer d = new Developer();
        d.input();
        d.output();
    }
 }
  */

interface customer{
    int amt = 5;        // public + final + static
    void purchase();    // public + Abstract
}

class seller implements customer{
    @Override
    public void purchase(){
        System.out.println("Customer needs "+amt+" kg rice...");
    }
}

class interfaceExample{
    public static void main(String[] args) {
        customer c = new seller();
        c.purchase();
    }
}
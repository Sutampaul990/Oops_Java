public class Circle {
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    public double calculateArea() {
        return Math.PI * rad * rad;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * rad;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5.25);
        System.out.println("Area : " + c1.calculateArea());
        System.out.println("Circumference : " + c1.calculateCircumference());
    }
}

// Parent class
class Person {
    String name;
    int age;

//Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Sub class Employee & parent class Person
class Employee extends Person {
    String employeeId;
    double salary;

    Employee(String name, int age, String employeeId, double salary) {
        // Calling constructor of parent class
        super(name, age);

        // Initializing subclass fields
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method for displaying the Employee details
    public void show() {
        System.out.println("Details of the Employee -------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Salary : " + salary);
    }
}

class MainClass {
    public static void main(String[] args) {
        // Creating an Object
        Employee emp = new Employee("Sutam Paul", 21, "User123Emp255", 50000);
        emp.show(); // display
    }
}

/*
 * OUTPUT :
 * Details of the Employee -------
 * Name : Sutam Paul
 * Age : 21
 * Employee Id : User123Emp255
 * Salary : 50000.0
 */
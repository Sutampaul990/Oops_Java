// Employee class
class Employee {
    // Data members of the class
    int id;
    String name;
    String contact;
    String address;
    int age;
    double basicSalary;
    String department;

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
    }

    // Method to calculate and display net salary
    public void calculateNetSalary() {
        double DA = 0.05 * basicSalary;  // 5% Dearness Allowance
        double HRA = 0.10 * basicSalary; // 10% House Rent Allowance
        double netSalary = basicSalary + DA + HRA;  // Total net salary
        System.out.println("Net Salary: " + netSalary);
    }

    public static void main(String[] args) {
        // Creating two instances of Employee
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        // Assigning values to the data members of emp1
        emp1.id = 01;
        emp1.name = "Sutam Paul";
        emp1.contact = "12345897";
        emp1.address = "Kolkat";
        emp1.age = 21;
        emp1.basicSalary = 30000;
        emp1.department = "IT";

        // Assigning values to the data members of emp2
        emp2.id = 02;
        emp2.name = "Ritam Singha";
        emp2.contact = "031789456";
        emp2.address = "Ballygaunge";
        emp2.age = 22;
        emp2.basicSalary = 35000;
        emp2.department = "Developer";

        // Calling methods for emp1
        System.out.println("------------ Employee 1 Information -----------");
        emp1.displayInfo();
        emp1.calculateNetSalary();
        System.out.println();  // Print a blank line for separation

        // Calling methods for emp2
        System.out.println("------------ Employee 2 Information -----------");
        emp2.displayInfo();
        emp2.calculateNetSalary();
    }
}


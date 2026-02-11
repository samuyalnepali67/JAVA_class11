import java.util.Scanner;

public class Employee {
    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void calculateBonus() {
        double bonus;

        if (basicSalary > 30000) {
            bonus = basicSalary * 0.10;
        } else {
            bonus = basicSalary * 0.05;
        }

        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (basicSalary + bonus));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();

        Employee employee = new Employee(name, salary);
        employee.calculateBonus();

    }
}
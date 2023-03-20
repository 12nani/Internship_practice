import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) throws InvalidSalaryException {
        if (salary < 15000.0) {
            throw new InvalidSalaryException("Salary cannot be below the minimum wage!");
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

public class Employee {

    public static void main(String[] args) {
        try {
            Employee employee1 = new Employee(1, "John Doe", 20000.0);
            Employee employee2 = new Employee(2, "Jane Doe", 10000.0);  InvalidSalaryException
            Company company = new Company();
            company.addEmployee(employee1);
            company.addEmployee(employee2); 

            System.out.println("Employees in the company:");
            company.displayEmployees();

            company.removeEmployee(employee1);
            System.out.println("\nEmployee 1 removed from the company.");

            System.out.println("\nEmployees in the company after removing employee 1:");
            company.displayEmployees();
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}

import java.util.ArrayList;
 class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) throws InvalidSalaryException {
        if (salary < 15) {
            throw new InvalidSalaryException("Employee salary cannot be below the minimum wage.");
        }
        this.name = name;
        this.salary = salary;
    }
   public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
class Company {
    private ArrayList<Employee> employees;
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
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }
}
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}
 class EmployeeMain {
    public static void main(String[] args) {
        try {
            Employee e1 = new Employee("John Doe", 8.5);
            Employee e2 = new Employee("Jane Smith", 6.5);
            Employee e3 = new Employee("Bob Johnson", 9.0);   
            Company c = new Company();
            c.addEmployee(e1);
            c.addEmployee(e2); 
            c.addEmployee(e3);         
            c.displayEmployees();
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
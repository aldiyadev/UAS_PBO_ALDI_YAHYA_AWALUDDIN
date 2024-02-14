import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList<Employee> employees;

    public PayrollSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double calculateTotalSalary() {
        double totalGaji = 0;
        for (Employee employee : employees) {
            totalGaji += employee.calculateSalary();
        }
        return totalGaji;
    }
}
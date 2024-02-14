public class Supervisor extends Employee {
    public Supervisor(String employeeCode) {
        super(employeeCode, 10000000);
    }

    @Override
    public double calculateSalary() {
        double totalGaji = standardGaji;
        totalGaji += jamKerja > 8 ? (jamKerja - 8) * 10000 : 0;
        totalGaji += 1000000;
        totalGaji += 300000; 
        totalGaji += 100000;
        return totalGaji;
    }
}
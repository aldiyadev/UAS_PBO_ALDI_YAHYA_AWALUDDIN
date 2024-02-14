public class Teknisi extends Employee {
    public Teknisi(String employeeCode) {
        super(employeeCode, 3000000);
    }

    @Override
    public double calculateSalary() {
        double totalGaji = standardGaji;
        totalGaji += jamKerja > 8 ? (jamKerja - 8) * 5000 : 0;
        totalGaji += 500000; // 
        totalGaji += 200000; // 
        totalGaji += 75000;  // 
        return totalGaji;
    }
}
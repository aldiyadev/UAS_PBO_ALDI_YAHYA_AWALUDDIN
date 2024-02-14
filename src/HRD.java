public class HRD extends Employee {
    public HRD(String employeeCode) {
        super(employeeCode, 5000000);
    }

    @Override
    public double calculateSalary() {
        double totalGaji = standardGaji;
        totalGaji += jamKerja > 8 ? (jamKerja - 8) * 7500 : 0;
        totalGaji += 750000; 
        totalGaji += 250000; 
        totalGaji += 90000;  
        return totalGaji;
    }
}
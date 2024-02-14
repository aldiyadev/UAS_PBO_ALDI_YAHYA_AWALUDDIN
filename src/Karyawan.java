public class Karyawan extends Employee {
    public Karyawan(String employeeCode) {
        super(employeeCode, 1500000);
    }

    /**
     *
     * @return
     */
    @Override
    public double calculateSalary() {
        double totalGaji = standardGaji;
        totalGaji += jamKerja > 8 ? (jamKerja - 8) * 5000 : 0;
        totalGaji += 250000; 
        totalGaji += 200000; 
        totalGaji += 60000;  
        return totalGaji;
    }
}

public abstract class Employee {
    protected String employeeCode;
    protected double standardGaji;
    protected int jamKerja;

    public Employee(String employeeCode, double standardGaji) {
        this.employeeCode = employeeCode;
        this.standardGaji = standardGaji;
    }

    /**
     *
     * @return
     */
    @SuppressWarnings("empty-statement")
    public  double calculateSalary(){;
        double totalGaji = standardGaji;
        int lateHours = Math.max(0, jamKerja - 7); 
        int shortfallHours = Math.max(0, 16 - jamKerja); 
        totalGaji -= 100000 * lateHours;
        totalGaji -= 100000 * shortfallHours;
        // 
        return totalGaji;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
}

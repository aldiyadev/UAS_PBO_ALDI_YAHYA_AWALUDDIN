public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        
        Supervisor supervisor = new Supervisor("SPV001");
        HRD hrd = new HRD("HRD001");
        Teknisi teknisi = new Teknisi("TKN001");
        Karyawan karyawan = new Karyawan("KRY001");

        payrollSystem.addEmployee(supervisor);
        payrollSystem.addEmployee(hrd);
        payrollSystem.addEmployee(teknisi);
        payrollSystem.addEmployee(karyawan);

        // Set hours worked for each employee
        supervisor.setJamKerja(9);
        hrd.setJamKerja(8);
        teknisi.setJamKerja(10);
        karyawan.setJamKerja(7);

        double totalGaji = payrollSystem.calculateTotalSalary();
        System.out.println("Total Gaji: " + totalGaji);
        
    }
}
package list_3.SRP.Exemple2;

class PayslipGenerator {
    public void generatePayslip(Employee employee) {
        System.out.println("Generating payslip for " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
    }
}
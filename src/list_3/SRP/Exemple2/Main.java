package list_3.SRP.Exemple2;

import list_3.SRP.Exemple1.FileManager;
import list_3.SRP.Exemple1.ReportGenerator;

public class Main {

    public static void main(String[] args) {

        ReportGenerator generator = new ReportGenerator();
        FileManager fileManager = new FileManager();

        String report = generator.generateReport();
        fileManager.saveToFile(report, "quarterly_report.txt");

        System.out.println("\n--- Employee Example ---");

        Employee emp = new Employee("John Doe", 5000.0);
        EmployeeRepository repository = new EmployeeRepository();
        PayslipGenerator payslipGen = new PayslipGenerator();

        repository.save(emp);
        payslipGen.generatePayslip(emp);
    }

}

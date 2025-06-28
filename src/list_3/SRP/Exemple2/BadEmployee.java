package list_3.SRP.Exemple2;

class BadEmployee {
    private String name;
    private double salary;

    public BadEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void saveToDatabase() {
        System.out.println("Saving employee to database...");
    }

    public void generatePayslip() {
        System.out.println("Generating payslip for " + name);
    }
}
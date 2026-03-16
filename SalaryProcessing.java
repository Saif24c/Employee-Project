class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateSalary(int hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public double calculateSalary(int hoursWorked, double hourlyRate, double bonus) {
        double baseSalary = super.calculateSalary(hoursWorked, hourlyRate);
        return baseSalary + bonus;
    }
}

public class SalaryProcessing {
    public static void main(String[] args) {
        String[] employeeNames = {"saif", "jagath", "yugesh"};

        for (int i = 0; i < employeeNames.length; i++) {
            employeeNames[i] = employeeNames[i].toUpperCase();
            employeeNames[i] = employeeNames[i].substring(0, 1) + employeeNames[i].substring(1).toLowerCase();
        }

        Employee standardEmployee = new Employee(employeeNames[0]);
        double empSalary = standardEmployee.calculateSalary(160, 25.0);

        Manager branchManager = new Manager(employeeNames[1]);
        double mgrSalary = branchManager.calculateSalary(160, 40.0, 2000.0);

        System.out.println("Employee: " + standardEmployee.getName());
        System.out.println("Calculated Salary: $" + empSalary);
        System.out.println("Name Length: " + standardEmployee.getName().length());
        
        System.out.println("---");
        
        System.out.println("Manager: " + branchManager.getName());
        System.out.println("Calculated Salary: $" + mgrSalary);
        System.out.println("Contains 'Jagath': " + branchManager.getName().contains("Jagath"));
    }
}
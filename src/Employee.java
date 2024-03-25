public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;

    // Constructor initializing employee data
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;    
        this.hireDate = hireDate;
    }

    // Override toString() method to provide a formatted string representation of Employee
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

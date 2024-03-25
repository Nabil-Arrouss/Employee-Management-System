public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    // Constructor initializing hourly employee data
    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    // Method to calculate and return regular pay
    public double collectPay (){
        return 40 * hourlyPayRate;
    }

    // Method to calculate and return double pay (for holiday hours)
    public double getDoublePay(){
        return 2 * collectPay();
    }
}

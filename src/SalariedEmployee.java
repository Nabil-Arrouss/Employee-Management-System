public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    // Constructor initializing salaried employee data
    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    // Method to calculate and return the regular paycheck amount
    public double collectPay (){
        double paycheck = annualSalary /26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck; // Adjust pay for retired employees

        return (int) adjustedPay; // Return the adjusted paycheck as an integer (rounded down)
    }

    // Method to retire the employee
    public void retire(){

        terminate("12/12/2025");  // Terminate the employment with a specified end date
        isRetired = true;  // Mark the employee as retired
    }

}

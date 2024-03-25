public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker (){

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Method to calculate and return the worker's age
    public int getAge (){
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6)); 
        return (currentYear - birthYear);
    }

     // Method to calculate and return the worker's pay (to be overridden by subclasses)
    public double collectPay (){
        return 0.0;
    }

    // Method to terminate the worker's employment with a specified end date
    public void terminate (String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

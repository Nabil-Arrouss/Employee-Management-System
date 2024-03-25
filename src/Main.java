public class Main {
    public static void main(String[] args) {

        // Creating instances of employees and demonstrating their functionality
        Employee nabilArrouss = new Employee("Nabil ", "15/01/1998", "01/01/2020");

        System.out.println(nabilArrouss);
        System.out.println("Age = " + nabilArrouss.getAge());
        System.out.println("Pay = " + nabilArrouss.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe ", "15/01/1996", "01/01/2220", 35000);

        System.out.println(joe);    

        System.out.println(joe.collectPay());
        joe.retire();
        System.out.println("joe pension check = "+ joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("MARY", "05/05/1998","03/03/2021",15);

        System.out.println(mary);
        System.out.println("Mary's paycheck = " + mary.collectPay());
        System.out.println("Mary's holiday pay = " + mary.getDoublePay());


    }
}

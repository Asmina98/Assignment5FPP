public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    //Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNum, double wage, double hours) {
        super(firstName, lastName, socialSecurityNum);
        this.wage = wage;
        this.hours = hours;
    }

    //Instance method (Implemented abstract method)
    @Override
    public double getPayment() {
        return (wage * hours);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", wage=" + wage + "\'" +
                ", hours=" + hours + "\'" +
                "}";
    }
}

public class BaseClassCommisionEmployee  extends CommissionEmployee{
    private double baseSalary;

    //Constructor
    public BaseClassCommisionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    //Instance method
    @Override
    public double getPayment() {
        return super.getPayment() + baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", baseSalary=" + baseSalary + "\'" +
                "}";
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

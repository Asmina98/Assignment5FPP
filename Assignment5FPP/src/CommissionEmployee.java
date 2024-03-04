public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    //Constructor
    public CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    //Instance method (Implemented abstract method)
    @Override
    public double getPayment() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", grossSales=" + grossSales + "\'" +
                ", commissionRate=" + commissionRate +
                "}";
    }
}

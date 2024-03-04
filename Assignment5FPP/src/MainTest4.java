public class MainTest4 {
    public static void main(String[] args) {
        Employee[] e = new Employee[]{
                new CommissionEmployee("Linda", "Tom", "12345", 5540, 4),
                new HourlyEmployee("Bianca", "Carlos", "23465", 10, 12),
                new SalariedEmployee("James", "Michael", "23474", 1500),
                new BaseClassCommisionEmployee("Jacob", "Alex", "5345", 5000, 5, 2000),
                new SalariedEmployee("Ana", "Henry", "33459", 1400)
        };

        //Invoking totalSalaries() method
        totalSalaries(e);
    }

    //totalSalaries() method
    public static void totalSalaries(Employee[] e) {
        int sum = 0;
        for (Employee emp : e) {
            sum += emp.getPayment();
            System.out.println(emp.toString());
        }
        System.out.println("Sum of All Salaries : " + sum);
    }
}

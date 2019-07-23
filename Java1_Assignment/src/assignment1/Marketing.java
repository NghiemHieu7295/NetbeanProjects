package assignment1;

public class Marketing extends Employee{
    private double sales;
    private double commission;

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    @Override
    public double getInCome(){
        return this.getSalary() + this.getSales() + this.getCommission();
    }
}
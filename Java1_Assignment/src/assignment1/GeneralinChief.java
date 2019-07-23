package assignment1;

public class GeneralinChief extends Employee{
    private double trachNhiem;

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    
    @Override
    public double getInCome(){
        return this.getSalary() + this.getTrachNhiem();
    }
}
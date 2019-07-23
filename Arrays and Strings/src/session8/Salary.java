package session8;

public class Salary extends Employee{
    private double salary;
    public Salary(String name, String address, int number, double 
            salary){
        super(name, address, number);
        setSalary(salary);
    }
    
    @Override
    public void mailCheck(){
        System.out.println("Ben trong mailCheck cua salary class");
        System.out.println("Gui mail kiem tra toi " + getName() + 
                " voi salary la " + salary);
    }
    
    public double getSalary(){
        return salary;
    }
    
    public final void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
    
    @Override
    public double computePay(){
        System.out.println("Tinh toan luong tra cho " + getName());
        return salary / 52;
    }
}
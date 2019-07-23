package assignment1;

public abstract class Employee {
    private String empCode;
    private String empName;
    private double salary;

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public abstract double getInCome();
    
    public double getInComeTax(){
        double tax = 0.0;
        
        if(this.getInCome() < 9000000){
            return tax;
        }else if((this.getInCome() >= 9000000) && (this.getInCome() <= 15000000)){
            tax = this.getInCome() * 10 / 100;
            return tax;
        }else{
            tax = this.getInCome() * 12 / 100;
            return tax;
        }
    }
    
    public void xuat(){
        System.out.println("Mã nhân viên: " + this.getEmpCode());
        System.out.println("Họ tên: " + this.getEmpName());
        System.out.println("Lương: " + this.getSalary());
        System.out.println("Thu nhập: " + this.getInCome());
        System.out.println("Thuế thu nhập: " + this.getInComeTax());
    }
}
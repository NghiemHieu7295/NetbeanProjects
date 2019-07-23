package session10;

class Employee{
    String empId;
    String empName;
    int salary;
    float commission;
    
    public Employee(String id, String name, int sal){
        empId = id;
        empName = name;
        salary = sal;
    }
    
    public void calcCommission(float sales){
        if(sales > 10000)
            commission = salary * 20 / 100;
        else
            commission = 0;
    }
    
    //Overloaded method. Use static binding.
    public void calcCommission(int overtime){
        if(overtime > 8)
            commission = salary / 30;
        else
            commission = 0;
    }
    
    public void displayDetails(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Commission: " + commission);
    }
}

class PartTimeEmployee extends Employee{
    String shift;
    
    public PartTimeEmployee(String id, String name, int sal,
            String shift){
        super(id, name, sal);
        this.shift = shift;
    }
    
    //Overrided method. Use dynamic binding.
    @Override
    public void displayDetails(){
        calcCommission(12);
        super.displayDetails();
        System.out.println("Working shift: " + shift);
    }
}

public class EmployeeDetails {
    public static void main(String[] args){
        Employee obj = new Employee("E001", "Maria Nemeth", 40000);
        obj.calcCommission(20000F);
        obj.displayDetails();
        System.out.println("------------------");
        Employee obj1 = new PartTimeEmployee("E002", "Rob Smith", 30000,
        "Day");
        /*Object type: Employee
          Reference type: PartTimeEmployee
        
          Upcasting:
          PartTimeEmployee objPT = new PartTimeEmployee();
          Employee objEmp = objPT;
        
          Downcasting:
          PartTimeEmployee objPT1 = (PartTimeEmployee) objEmp;
        */
        obj1.displayDetails();
    }
}

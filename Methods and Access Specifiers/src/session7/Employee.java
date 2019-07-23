package session7;

public class Employee {
    int empID;
    String empName;
    private String SSN;
    protected String empDesig;
    
    /**
     * Parameterize constructor
     * 
     * @param ID an integer variable storing the employee ID
     * @param name a string variable storing the employee name
     */
    public Employee(int ID, String name){
        empID = ID;
        empName = name;
    }
    
    /**
     * Return the value of SSN
     * 
     * @return String
     */
    public String getSSN(){
        return SSN;
    }
    
    /**
     * Sets the value of SSN
     * 
     * @param ssn a string variable storing the social security number
     */
    public void setSSN(String ssn){
        SSN = ssn;
    }
    
    /**
     * Sets the value of Designation
     * 
     * @param desig a string variable storing the employee designation
     */
    public void setDesignation(String desig){
        empDesig = desig;
    }
    
    /**
     * Displays employee details
     */
    public void display(){
        System.out.println("Employee ID is: " + empID);
        System.out.println("Employee Name is: " + empName);
        System.out.println("Designation is: " + empDesig);
        System.out.println("SSN is: " + SSN);
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Employee emp = new Employee(1200, "Roger Stevens");
       emp.empDesig = "Manager";
       emp.SSN = "281-72-3873";
       emp.display();
    }
}

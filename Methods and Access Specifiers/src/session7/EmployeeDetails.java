package session7;

public class EmployeeDetails {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = new Employee(1300, "Clara Smith");
        emp.empDesig = "Receptionist";
        emp.setSSN("282-72-3873");
        emp.display();
    }
    
}

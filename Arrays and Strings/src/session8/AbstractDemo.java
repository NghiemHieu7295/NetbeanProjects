package session8;

public class AbstractDemo {

    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        
        System.out.println("Goi mailCheck boi su dung tham chieu Salary");
        s.mailCheck();
        
        System.out.println("Goi mailCheck boi su dung tham chieu Employee");
        e.mailCheck();
    }   
}

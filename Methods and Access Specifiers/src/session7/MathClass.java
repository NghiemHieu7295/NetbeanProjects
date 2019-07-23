package session7;

public class MathClass {
    /**
     * Method to add two integers
     * 
     * @param num1 an integer variable storing the value of first number
     * @param num2 an integer variable storing the value of second number
     */
    public void add(int num1, int num2){
        System.out.println("Result after addition is: " + (num1 + num2));
    }
    
    /**
     * Overloaded method to add three integers
     * 
     * @param num1 an integer variable storing the value of first number
     * @param num2 an integer variable storing the value of second number
     * @param num3 an integer variable storing the value of third number
     */
    public void add(int num1, int num2, int num3){
        System.out.println("Result after addition is: " + (num1 + num2 + num3));
    }
    
    /**
     * Overloaded method to add a float and an integer
     * 
     * @param num1 a float variable storing the value of first number
     * @param num2 an integer variable storing the value of second number
     */
    public void add(float num1, int num2){
        System.out.println("Result after addition is: " + (num1 + num2));
    }
    
    /**
     * Overloaded method to add a float and an integer accepting the values
     * in a difference sequence
     * 
     * @param num1 an integer variable storing the value of first number
     * @param num2 a float variable storing the value of second number
     */
    public void add(int num1, float num2){
        System.out.println("Result after addition is: " + (num1 + num2));
    }
    
    /**
     * Overloaded method to add two floating-points number
     * 
     * @param num1 a float variable storing the value of first number
     * @param num2 a float variable storing the value of second number
     */
    public void add(float num1, float num2){
        System.out.println("Result after addition is: " + (num1 + num2));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MathClass obj = new MathClass();
        
        obj.add(3.4F, 2);
        obj.add(4, 5);
        obj.add(6, 7, 8);
    }
}

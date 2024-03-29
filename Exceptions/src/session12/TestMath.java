package session12;

class Mathematics{
    /*public void divide(int num1, int num2){
        try{
            System.out.println("Division is: " + num1 / num2);
        }
        catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Method execution completed.");
    }*/
    
    public void divide(int num1, int num2) throws ArithmeticException{
        if(num2 == 0){
            throw new ArithmeticException("/ by zero");
        }
        else{
            System.out.println("Division is " + (num1 / num2));
        }
        
        System.out.println("Method execution completed.");
    }
}

public class TestMath {

    public static void main(String[] args) {
        if(args.length == 2){
            Mathematics objMath = new Mathematics();
            try{
            objMath.divide(Integer.parseInt(args[0]),
                    Integer.parseInt(args[1]));
            }
            catch(ArithmeticException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        else{
            System.out.println("Usage: java Mathematics <number1>"
                    + " <number2>");
        }
        System.out.println("Back to Main.");
    }
    
}

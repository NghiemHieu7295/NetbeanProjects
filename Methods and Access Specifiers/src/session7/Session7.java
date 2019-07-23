package session7;

import java.util.*;

class Circle{
    public double area;
    
    public double getPi(){
        return 3.14;
    }
    
    /**
     * Display the area of the circle
     * 
     * @param rad a double variable storing the radius of the circle
     * @return The area of the circle
     */
    
    public void calcArea(double rad){
        this.area = this.getPi() * rad * rad;
        System.out.println("Area is: " + this.area);
    }
}

public class Session7 {
    
    /**
    * Display the sum of two number 
    * 
    * @param num1 an integer variable storing the value of first number
    * @param num2 an integer variable storing the value of second number
    */
    
    public void add(int num1, int num2){
        int num3;
        num3 = num1 + num2;
        System.out.println("Result after addition is " + num3);
    }
    
    public void sub(int num1, int num2){
        int num3;
        num3 = num1 - num2;
        System.out.println("Result after subtraction is " + num3);
    }
    
    public void mul(int num1, int num2){
        int num3;
        num3 = num1 * num2;
        System.out.println("Result after multiplication is " + num3);
    }
    
    public void div(int num1, int num2){
        int num3;
        num3 = num1 / num2;
        System.out.println("Result after division is " + num3);
    }
    
    //Primitive data type is passed by value
    public void PassByValue(int num){
        num = num + 10;
        System.out.println("Num is: " + num);
    }
    
    //Array and Object are data types which are passed by reference
    public void PassByRef(Circle obj, double rad){
        obj.area = obj.getPi() * rad * rad;
    }
    
    //varargs
    public void addNumber(int...num){
        int sum = 0;
        
        for(int i:num){
            sum = sum + i;
        }
        
        System.out.println("Sum of numbers is: " + sum);
    }

    public static void main(String[] args) {
        int i, x = 10;
        Scanner input = new Scanner(System.in);
        Circle cir = new Circle();
        
        Session7 obj1 = new Session7();
        /*obj1.add(3, 4);
        obj1.sub(3, 4);
        obj1.mul(3, 4);
        obj1.div(3, 4);*/
        
        /*obj1.PassByValue(x);
        System.out.println("Num is: " + x);*/
        
        /*cir.calcArea(5); //area is 78.5
        obj1.PassByRef(cir, 6);
        System.out.println("Area is: " + cir.area);*/ //area is 113.04
        
        obj1.addNumber(10, 30, 20, 40);
    }
}
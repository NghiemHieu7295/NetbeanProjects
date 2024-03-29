package session10;

abstract class Shape{
    private final float PI = 3.14F;
    
    public float getPI(){
        return PI;
    }
    
    abstract void calculate(float val);
}

class Circle extends Shape{
    float area;
    
    @Override
    void calculate(float rad){
        area = getPI() * rad * rad;
        System.out.println("Area of circle is: " + area);
    }
}

class Rectangle extends Shape{
    float perimeter;
    float length = 10;
    
    @Override
    void calculate(float width){
        perimeter = 2 * (length + width);
        System.out.println("Perimeter of the Rectangle is: "
        + perimeter);
    }
}

public class Calculator {
    public static void main(String[] args){
        Shape objShape;
        String shape;
        
        if(args.length == 2){
            shape = args[0].toLowerCase();
            switch(shape){
                case "circle":
                    objShape = new Circle();
                    objShape.calculate(Float.parseFloat(args[1]));
                    break;
                case "rectangle":
                    objShape = new Rectangle();
                    objShape.calculate(Float.parseFloat(args[1]));
                    break;
            }
        }
        else
            System.out.println("Usage: java Calculator <shape-name>"
                    + " value");
    }  
}
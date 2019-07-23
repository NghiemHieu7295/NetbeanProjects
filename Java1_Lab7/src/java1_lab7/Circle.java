package java1_lab7;

public class Circle extends Shape{
    private double rad;
    
    public double getRad(){
        return rad;
    }
    
    public void setRad(double rad){
        this.rad = rad;
    }
    
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * this.getRad();
    }
    
    @Override
    public double getArea(){
        return Math.pow(rad, 2) * Math.PI;
    }
}
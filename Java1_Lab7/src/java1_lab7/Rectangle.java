package java1_lab7;

public class Rectangle extends Polygon{
   private double width;
   private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public Rectangle(){
        this.width = 0.0;
        this.length = 0.0;
    }
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
   
    @Override
    public double getPerimeter(){
        return (this.getWidth() + this.getLength()) * 2;
    }
    
    @Override
    public double getArea(){
        return this.getLength() * this.getWidth();
    }
    
    public void xuat(){
        System.out.println("Chiều dài: " + this.getLength());
        System.out.println("Chiều rộng: " + this.getWidth());
        System.out.println("Chu vi: " + this.getPerimeter());
        System.out.println("Diện tích: " + this.getArea());
    }
}
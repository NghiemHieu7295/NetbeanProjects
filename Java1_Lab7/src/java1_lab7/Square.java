package java1_lab7;

public class Square extends Rectangle{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    public Square(){
        this.side = 0.0;
    }
    
    public Square(double side){
        this.side = side;
    }
    
    @Override
    public double getPerimeter(){
        return this.getSide() * 4;
    }
    
    @Override
    public double getArea(){
        return Math.pow(this.getSide(), 3);
    }
    
    @Override
    public void xuat(){
        System.out.println("Cạnh: " + this.getSide());
        System.out.println("Chu vi: " + this.getPerimeter());
        System.out.println("Diện tích: " + this.getArea());
    }
}
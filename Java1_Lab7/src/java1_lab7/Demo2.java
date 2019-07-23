package java1_lab7;

public class Demo2 {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getArea());
        System.out.println();
        
        Circle circle1 = (Circle) shape1;
        circle1.setRad(3.5);
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
        System.out.println();
        
        Polygon polygon1 = new Rectangle();
        System.out.println(polygon1.getPerimeter());
        System.out.println(polygon1.getArea());
        System.out.println();
        
        Rectangle rect1 = (Rectangle) polygon1;
        rect1.setWidth(5);
        rect1.setLength(4);
        System.out.println(rect1.getPerimeter());
        System.out.println(rect1.getArea());
        System.out.println();
        
        Rectangle rect2 = new Square();
        rect2.setWidth(7);
        rect2.setLength(8);
        System.out.println(rect2.getPerimeter());
        System.out.println(rect2.getArea());
        System.out.println();
        
        Square square1 = (Square) rect2;
        square1.setWidth(7);
        square1.setLength(8);
        square1.setSide(7);
        System.out.println(square1.getPerimeter());
        System.out.println(square1.getArea());
    }   
}
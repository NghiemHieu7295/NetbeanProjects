package java1_lab7;

public class Triangle extends Polygon{
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }
    
    @Override
    public double getPerimeter(){
        return this.getFirstSide() + this.getSecondSide() + this.getThirdSide();
    }
    
    @Override
    public double getArea(){
        return 0.0;
    }
}
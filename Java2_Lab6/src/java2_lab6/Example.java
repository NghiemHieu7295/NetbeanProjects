package java2_lab6;

public class Example<T extends Number> {
    private T number;
    
    public Example(T n){
        this.number = n;
    }
    
    public double reciprocal(){
        return 1 / number.doubleValue();
    }
    
    public double fraction(){
        return number.doubleValue() - number.intValue();
    }
    
    public boolean testEqual(Example<?> e){
        if(this.number.doubleValue() == e.number.doubleValue()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Example<Integer> e1 = new Example<>(5);
        System.out.println(e1.reciprocal());
        System.out.println(e1.fraction());
        System.out.println();
        
        Example<Double> e2 = new Example<>(7.5);
        System.out.println(e2.reciprocal());
        System.out.println(e2.fraction());
        System.out.println();
        
        Example<Float> e3 = new Example<>(7.5F);
        System.out.println(e3.reciprocal());
        System.out.println(e3.fraction());
        System.out.println();
        
        Example<Double> e4 = new Example<>(5.0);
        
        System.out.println("e1 == e4 ? " + e1.testEqual(e4));
    }   
}
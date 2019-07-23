package java2_lab6;

public class Summation {

    private int sum;
    
    <T extends Number> Summation(T n){
        sum = 0;
        for(int i = 0; i <= n.intValue(); i++){
            sum = sum + i;
        }
    }
    
    int getSum(){
        return sum;
    }
    
    public static void main(String[] args) {
        Summation obj = new Summation(4.0);
        System.out.println("sum of 1-4 is: " + obj.getSum());
    }   
}
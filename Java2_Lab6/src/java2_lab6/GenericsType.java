package java2_lab6;

public class GenericsType<T> {
    private T t;
    private int a;
    
    public int getA(){
        return this.a;
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public T getT(){
        return this.t;
    }
    
    public void setT(T t){
        this.t = t;
    }

    public static void main(String[] args) {
        GenericsType<String> type1 = new GenericsType<>();
        type1.setT("Hello");
        type1.setA(10);
        System.out.println(type1.getT() + " " + type1.getA());
        
        GenericsType type2 = new GenericsType();
        type2.setT("World");
        type2.setT(10);
        System.out.println(type2);
    }   
}
package java2_lab6;

public class Pair<T, S> {
    private T first;
    private S second;
    
    public Pair(T first, S second){
        this.first = first;
        this.second = second;
    }
    
    public T getFirst(){
        return this.first;
    }
    
    public void setFirst(T first){
        this.first = first;
    }
    
    public S getSecond(){
        return this.second;
    }
    
    public void setSecond(S second){
        this.second = second;
    }
    
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "One");
        Pair<String, String> p2 = new Pair<>("Hello", "World");
        
        System.out.println(p1.getFirst() + " " + p1.getSecond());
        System.out.println(p2.getFirst() + " " + p2.getSecond());
    }   
}
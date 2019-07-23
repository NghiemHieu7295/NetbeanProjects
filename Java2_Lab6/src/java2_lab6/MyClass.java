package java2_lab6;

public class MyClass<T> implements Containment<T> {
    T[] arrayRef;
    
    MyClass(T[] arr){
        arrayRef = arr;
    }
    
    @Override
    public boolean contains(T obj){
        for(T x : arrayRef){
            if(x.equals(obj)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Integer[] x = {1, 2, 3};
        MyClass<Integer> ob = new MyClass<>(x);
        
        Integer a = 20;
        if(ob.contains(a)){
            System.out.println(a + " in array.");
        }
        else{
            System.out.println(a + " isn't in array.");
        }
    }   
}
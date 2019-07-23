package java1_lab8;

public class Demo3 {

    int sum(int...x){
        int s = 0;
        
        for(int a : x){
            s += a;
        }
        
        return s;
    }
    
    void ghepChuoi(String s, String...chuoi){
        String result;
        for(String a : chuoi){
            s += a;
        }
        result = s;
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        System.out.println(obj.sum(5, 34, 67, 22));
        int[] x = {1, 2, 3, 4, 5};
        System.out.println(obj.sum(x));
        String s = "Hello";
        obj.ghepChuoi(s, " World. ", "Welcome ", "to ", "Java.");
    }   
}
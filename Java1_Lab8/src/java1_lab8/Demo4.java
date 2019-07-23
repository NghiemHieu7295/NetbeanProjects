package java1_lab8;

public class Demo4 {

    static public int X = 100;
    static{
        X += 100;
    }
    
    static public void method(){
        X += 200;
    }
    
    public static void main(String[] args) {
        Demo4 obj = new Demo4();
        obj.X += 300;
        Demo4.X += 500;
        Demo4.method();
        
        System.out.println(obj.X);
        System.out.println(Demo4.X);
    }   
}
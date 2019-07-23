package session8;

public class Student implements Cloneable{
    int rollno;
    String name;
    
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public static String concatWithString(){
        String t = "Java";
        for(int i = 0; i < 10000; i++){
            t = t + "Vietjack";
        }
        return t;
    }
    
    public static String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 10000; i++){
            sb.append("Vietjack");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Thoi gian tieu ton boi nuoi chuoi voi"
                + " String: " + (System.currentTimeMillis() - startTime)
        + "ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Thoi gian tieu ton boi nuoi chuoi voi"
                + " StringBuffer: " + (System.currentTimeMillis() - startTime)
        + "ms");
    }  
}
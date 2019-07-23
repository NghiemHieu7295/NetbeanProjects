package java2_lab4;

public class ThreadB implements Runnable{
    
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("ThreadB " + i);
        }
    }
}
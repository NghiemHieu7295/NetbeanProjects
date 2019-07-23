package java2_lab4;

public class ThreadC extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("ThreadC " + i);
        }
    }
}
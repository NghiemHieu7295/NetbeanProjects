package java2_lab4;

public class Bai1 implements Runnable{

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        Bai1 r1 = new Bai1();
        Bai1 r2 = new Bai1();
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
    }   
}
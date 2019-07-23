package java2_lab4;

public class ThirdDemoThread implements Runnable{

    private int num = 1000;
    
    @Override
    public void run(){
        while(num > 0){
            num = num - 100;
            System.out.println(Thread.currentThread().getName() + " " + num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Finish " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        ThirdDemoThread r = new ThirdDemoThread();
        
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        
        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");
        
        t1.start();
        t2.start();
        t3.start();
    }   
}
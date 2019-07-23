package java2_lab4;

public class Bai3 {
    
    public synchronized void inDaySo() throws InterruptedException{
        for(int i = 1; i <= 10; i++){
            System.out.print(Thread.currentThread().getName() + " " + i + " ");
            Thread.sleep(500);
            notify();
            wait();
        }
        notifyAll();
    }
    
    public synchronized void check() throws InterruptedException{
        for(int i = 1; i <= 10; i++){
            if((i % 2) == 0){
                System.out.println(Thread.currentThread().getName() + " " + "Chẵn");
                notify();
                wait();
            }
            else{
                System.out.println(Thread.currentThread().getName() + " " + "Lẻ");
                notify();
                wait();
            }
        }
        notifyAll();
    }
    
    public static void main(String[] args) throws InterruptedException {
        Bai3 obj = new Bai3();
        
        Thread t1 = new Thread(){
            @Override
            public void run(){
                try{
                    obj.inDaySo();
                }
                catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        };
        
        Thread t2 = new Thread(){
            @Override
            public void run(){
                try{
                    obj.check();
                }
                catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        };
        
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }   
}
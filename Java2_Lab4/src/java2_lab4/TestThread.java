package java2_lab4;

public class TestThread implements Runnable{
    private int account = 1000;
    
    public synchronized void rutTien(int m){
        String threadName = Thread.currentThread().getName();
        
        System.out.println(threadName + " Đang rút tiền...");
        this.account = this.account - m;
        if(this.account < 0){
            System.out.println(threadName + " Không đủ tiền.");
            System.out.println();
        }
        else{
            System.out.println(threadName + " Rút tiền thành công!");
            System.out.println(threadName + " Số tiền còn lại trong tài khoản: " + this.account);
            System.out.println();
        }
    }
    
    @Override
    public void run(){
        rutTien(400);
    }
    
    public static void main(String[] args) throws InterruptedException {
        TestThread  r = new TestThread();
        
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
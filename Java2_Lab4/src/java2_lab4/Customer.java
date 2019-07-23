package java2_lab4;

public class Customer {

    int amount = 1000;
    
    public synchronized void withdraw(int m){
        System.out.println("Bạn đang rút tiền...");
        if(amount < m){
            System.out.println("Không đủ tiền để rút!");
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        amount = amount - m;
        System.out.println("Bạn đã rút tiền thành công!!!");
        System.out.println("Số tiền còn lại: " + amount);
    }
    
    public synchronized void deposit(int m){
        System.out.println("Bạn đang nạp tiền...");
        amount = amount + m;
        System.out.println("Nạp tiền thành công!!!");
        System.out.println("Số tiền hiện có: " + amount);
        notify();
    }
    
    public static void main(String[] args) {
        Customer c = new Customer();
        
        Thread t1 = new Thread(){
            @Override
            public void run(){
                c.withdraw(1500);
            }
        };
        t1.start();
        
        Thread t2 = new Thread(){
            @Override
            public void run(){
                c.deposit(2000);
            }
        };
        t2.start();
    }   
}
package java2_lab4;

public class SecondDemoThread extends Thread{
    
    private int num = 1000;
    
    @Override
    public void run(){
        while(num > 0){
            num = num - 100;
            System.out.println(this.getName() + " " + num);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Finish " + this.getName());
    }
    
    public static void main(String[] args) {
        SecondDemoThread thread1 = new SecondDemoThread();
        SecondDemoThread thread2 = new SecondDemoThread();
        SecondDemoThread thread3 = new SecondDemoThread();
        
        thread1.setName("Thread1");
        thread2.setName("Thread2");
        thread3.setName("Thread3");
        
        thread1.start();
        thread2.start();
        thread3.start();
    }   
}
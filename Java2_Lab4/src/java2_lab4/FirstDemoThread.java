package java2_lab4;

public class FirstDemoThread {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        
        Thread thread1 = new Thread(threadA);
        Thread thread2 = new Thread(threadB);
        ThreadC thread3 = new ThreadC();
        
        thread1.start();
        thread2.start();
        thread3.start();
    }   
}
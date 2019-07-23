package java2_lab4;

public class Bai2 {
    
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
          @Override
          public void run(){
              for(int i = 1; i <= 10; i++){
                  if((i % 2) == 0){
                      System.out.print(i + " ");
                  }
                  try{
                      Thread.sleep(500);
                  }
                  catch(InterruptedException e){
                      System.out.println(e.getMessage());
                  }
              }
          }
        };
        
        Thread t2 = new Thread(){
          @Override
          public void run(){
              for(int i = 1; i <= 10; i++){
                  if((i % 2) != 0){
                      System.out.print(i + " ");
                  }
                  try{
                      Thread.sleep(500);
                  }
                  catch(InterruptedException e){
                      System.out.println(e.getMessage());
                  }
              }
          }
        };
        
        t1.start();
        t1.join();
        t2.start();
    }   
}
package javatest;

public class ticket implements Runnable{
    private int tickets=10;
    @Override
    public void run() {
       while(true){

           if(tickets>0){
               try {
                   Thread.sleep(10);
               } catch (InterruptedException e) {}
               System.out.println(tickets+"张票"+Thread.currentThread().getName());
               tickets--;
           }else
               //return;
           break;;
       }

    }
}

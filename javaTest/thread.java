package javatest;

public class thread extends Thread {


    /*public thread() {
    }*/

    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName());
            //System.out.println("run"+i);
            //System.out.println("mingzi"+getName());
        }
    }

}

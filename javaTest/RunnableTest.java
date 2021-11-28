package javatest;

public class RunnableTest {
    public static void main(String[] args) {
        runnable run=new runnable();
        Thread th=new Thread(run);
        th.start();
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
    }


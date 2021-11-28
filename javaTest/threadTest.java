package javatest;

public class threadTest {
    public static void main(String[] args) {
        thread th=new thread();
        th.start();
        Thread thread =Thread.currentThread();
        System.out.println(thread.getName());
        for (int i = 0; i < 50; i++) {
            System.out.println("main"+i);

        }
    }
}

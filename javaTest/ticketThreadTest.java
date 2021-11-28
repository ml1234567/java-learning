package javatest;

public class ticketThreadTest {
    public static void main(String[] args) {
        ticket tm=new ticket();
        Thread t0=new Thread(tm);
        Thread t1=new Thread(tm);
        Thread t2=new Thread(tm);
        t0.start();
        t1.start();
        t2.start();
        //会出现错误
    }
}

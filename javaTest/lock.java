package javatest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lock implements Runnable {

        private int tickets=100;
        private Lock lock=new ReentrantLock();


        @Override
        public void run() {
            while(true){
                lock.lock();
                if(tickets>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {}
                    System.out.println(tickets+"张票"+Thread.currentThread().getName());
                    tickets--;
                }lock.unlock();
                /*else
                    //return;
                    break;;*/
            }

        }

    public static void main(String[] args) {
        lock tm=new lock();
        Thread t0=new Thread(tm);
        Thread t1=new Thread(tm);
        Thread t2=new Thread(tm);
        t0.start();
        t1.start();
        t2.start();
    }
    }


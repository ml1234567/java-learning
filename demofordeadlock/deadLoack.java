package javatest.deadLock;

public class deadLoack implements Runnable{
    private boolean flag;
    public deadLoack(boolean flag){
        this.flag=flag;//新建有参构造方法
    }


    @Override
    public void run() {
        while(true)
        if (flag)

        {
            synchronized (lockB.lockB) {
                System.out.println(Thread.currentThread().getName()+"线程获取b锁");
                synchronized (lockA.lockA){
                    System.out.println(Thread.currentThread().getName()+"线程获取a锁");
                }
            }
        }else
            synchronized (lockA.lockA){
                System.out.println(Thread.currentThread().getName()+"线程获取a锁");
                synchronized (lockB.lockB){
                    System.out.println(Thread.currentThread().getName()+"线程获取b锁");
                }
            }
    }
}

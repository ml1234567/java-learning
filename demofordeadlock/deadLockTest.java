package javatest.deadLock;

public class deadLockTest {
    public static void main(String[] args) {
        deadLoack deadLoack=new deadLoack(true);
        deadLoack deadLoack1=new deadLoack(false);
        new Thread(deadLoack1).start();
        new Thread(deadLoack).start();
        /*deadLoack.run();
        deadLoack1.run();//这种写法和线程没关系*/

    }
}

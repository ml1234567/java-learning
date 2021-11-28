package javatest;

public class ticketsTest {
    public static void main(String[] args) {
        ticket ti=new ticket();
        ticket ti1=new ticket();
        ticket ti2=new ticket();
        ti.run();
        ti1.run();
        ti2.run();
        //这只是把卖100张票的过程跑了三遍。。。根本和线程没关系

    }
}

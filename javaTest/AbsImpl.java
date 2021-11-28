package javatest;

public class AbsImpl {
    public static void main(String[] args) {
        Abs Anna=new Abst();//重要，最前面还是和继承一样，声明一个接口被implement的类实现
        Abstr Ann=new Abst();
        Abst An=new Abst();
        System.out.println(Anna.N);
        System.out.println(Ann.M);
        An.run();
        An.eat();
        Ann.run();
        Anna.eat();
    }
}

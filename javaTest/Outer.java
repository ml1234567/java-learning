package javatest;

public class Outer {
    int x=2;
    public void outer(){
        int x=5;
    }
    public class Inner {
        int x =1;
        public void inner(){
            int x =0;
            System.out.println("内部类的内部方法的局部变量"+x);
            System.out.println("内部类的成员变量"+this.x);
            System.out.println("外部类的成员变量"+Outer.this.x);
            //System.out.println("外部类的外部方法的局部变量"+new Outer().outer().x;);
        }
    }

    public static void main(String[] args) {
        Outer.Inner n =new Outer().new Inner();
        n.inner();
    }
}

package javatest;

public class Test {
    public static void main(String[] args) {
        Man ex = new Man();
        //Man exx = (Man) new person();
        ex.name="xiaohuang";
        ex.age=100;
        System.out.println(ex.name);
        System.out.println(ex.age);
    }
    public void print(){
        System.out.println("print方法");
    }
}

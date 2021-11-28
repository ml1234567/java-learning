package javatest;

public class Daughter extends Mom{
    String s ="Daghter";
    public void print(){
        String s ="xiaohong";
        String t = super.s;
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(t);
    }
}

package javatest;

public class ManTest {
    public static void main(String[] args) {
        Human hu = new Women();//多态
        hu.walk();
        Women huml=(Women)hu;
        huml.kill();
        boolean b=huml instanceof Women;
        System.out.println(b);
        boolean c=hu instanceof Women;
        System.out.println(c);
        boolean d=hu instanceof Human;
        System.out.println(d);
    }

}

package javatest;

public class toString {
    public static void main(String[] args) {
        Human hu =new Human(8);
        System.out.println(hu);
        Human le=new Human("xiaohuang",9);
        System.out.println(le);
        boolean b= hu.equals(le);
        System.out.println(b);
        /*StringBuffer m= new StringBuffer();
        m="jchgnu";*/
    }
}
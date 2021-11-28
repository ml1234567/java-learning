package javatest;

public class MomTest {
    public static void main(String[] args) {
        Daughter dau = new Daughter();
        System.out.println(dau.s);


        Mom mom = new Mom();
        System.out.println(mom.s);

        //System.out.println(s);

        dau.print();
        mom.print();
    }
}

package javatest;

import javax.naming.spi.StateFactory;

public class PersonnTest {
    public static void main(String[] args) {
        Personn p1 = new Faculty();
        Personn p2 = new Staff();
        Faculty p3=(Faculty)p1;
        p3.degree="本科";
        Staff p4=(Staff)p2;
        p4.duty="职员";
        System.out.println(p3.degree);
        System.out.println(p4.duty);
    }

}

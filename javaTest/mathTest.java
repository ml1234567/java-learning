package javatest;

import java.math.BigInteger;

public class mathTest {
    public static void main(String[] args) {
        BigInteger bi=new BigInteger("8948398385894030290495940309544");
        BigInteger bi1=new BigInteger("7593839949303930394939309939359");
        BigInteger bi2=bi.subtract(bi1);
        System.out.println(bi2);

    }

}

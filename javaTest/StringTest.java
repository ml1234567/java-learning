package javatest;

import jdk.nashorn.internal.objects.annotations.Property;

import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class StringTest {
    public static void main(String[] args) {
        char data[] = {'1', '2', '3'};
        String data2 = new String(data);
        String data1 = "123";
        System.out.println(data2 == data1);
        byte[] bytes = {-23, -25, -45, -56, -46, -67};
        String sm = new String((bytes));
        System.out.println(sm);
        String s="1unemvr6";
        System.out.println(s.getBytes());
        System.out.println("124".startsWith("1"));
        System.out.println("123".endsWith("3"));
        System.out.println("12345".contains("6"));
        System.out.println("".isEmpty());
        System.out.println("".length());
        System.out.println("jtieudngnrmcu".charAt(8));
        System.out.println("djfcwiuncufgrflmc".indexOf("m"));
        System.out.println("fgnrycyicrhiscngh".lastIndexOf("g"));
        System.out.println("fjngdsiijfitjmyr".substring(8,9));
        System.out.println("sty".compareTo("yhefhiygfxc"));
        String  tel="13259983724";
        String regex="1[3-9][0-9]{9}";
        boolean bu=tel.matches(regex);
        System.out.println(bu);
        StringBuilder sb= new StringBuilder();
        sb.append("rfyggyun ");
        System.out.println(sb);
        System.out.println(sb.reverse());
        sb.append(sb);
        System.out.println(sb);
        long tm=System.currentTimeMillis();
        System.out.println(tm);
        int[]sim={1,3,5,7,9};
        int []vodafine={2,4,6,8,10};
        System.out.println(vodafine);
        System.arraycopy(vodafine,1,sim,0,2);
        System.out.println(vodafine);
        System.out.println(sim);
        Properties p=System.getProperties();
        System.out.println("p.getProperty() = " + p);
        System.out.println(Math.PI);


    }
}

package javatest;

import java.util.Collections;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) {
    prop1();
    }
    public static void prop(){
        Properties pro=new Properties();
        pro.setProperty("nima","niba");
        pro.setProperty("cao","fu");
        System.out.println(pro);
        System.out.println(pro.getProperty("cao"));
    }
    public static void prop1(){
        Properties pro=new Properties();
        pro.setProperty("nima","niba");
        pro.setProperty("cao","fu");
        pro.setProperty("en","hao");
        System.out.println(pro);
        Set<String> set= pro.stringPropertyNames();//其实还是调用了keyset
        for(String key:set){
            System.out.println(key+"."+pro.getProperty((String) key));
        }
    }
        }

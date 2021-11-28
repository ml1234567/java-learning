package javatest;

import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap();
        map.put("xiaoa",1);
        map.put("xiaob",7);
        map.put("xiaoc",2);
        System.out.println(map);
        System.out.println(map.toString());
        Set <String > set= map.keySet();//key的集合
        Iterator<String> ite=set.iterator();//key的集合的迭代器
        while(ite.hasNext()){//迭代key集合的时候
            String key=ite.next();//先把key取出来
            //System.out.println(key);
            Integer value=map.get(key);//再把value取出来。这时候用map对象来操作
            System.out.println(key+"="+value);//打印

        }
        }
    }




package javatest;

import java.util.Comparator;
import java.util.TreeMap;

public class treeMap {


    public static void main(String[] args) {
        TreeMap<Integer, Integer> tm=new TreeMap<Integer, Integer>();
        TreeMap<Mankind,String> tm1=new TreeMap<Mankind,String>(new MyCom());
        tm1.put(new Mankind("xiaohua",8),"hml");
        tm1.put(new Mankind("xiaohuaaa",9),"hjll");
        tm1.put(new Mankind("xiaohuaaa",89),"hjll");
        System.out.println(tm1);


    }
    static class MyCom implements Comparator<Mankind>{
    //TreeMap在调用这个方法，后来的对象传到2，已有的对象传到1
        @Override
        public int compare(Mankind o1, Mankind o2) {
            return o1.getAge()-o2.getAge();
        }
    }
}

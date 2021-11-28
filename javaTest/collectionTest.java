package javatest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class collectionTest {
    public static void main(String[]args){
        ArrayList al=new ArrayList();
        //接口多态创建集合容器对象，存储的数据类型，是字符串
        Collection<String> col = new ArrayList<>();
        col.add("gjoiiu");
        col.add("shibushi");
        col.add("bufahuo");
        col.add("jiubabiren");
        col.add("dangshazia ");
        System.out.println(col.toString());
        Iterator<String> it=col.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }



}

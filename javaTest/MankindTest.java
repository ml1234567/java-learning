package javatest;

import java.util.ArrayList;
import java.util.Collection;

public class MankindTest {
    public static void main(String[] args) {
        Collection<Mankind>col=new ArrayList<>();
        col.add(new Mankind("name",9));//牵扯到构造器，所以new来添加
        col.add(new Mankind("ZHENGSHUANG",8));
        col.add(new Mankind("haha",10));
        col.add(new Mankind());
        System.out.println(col.toString());

    }
}

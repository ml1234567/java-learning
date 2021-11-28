package javatest;

import sun.text.normalizer.UCharacter;

public class generic {
    public static void main(String[] args) {

        genericTest<String> gt=new genericTest<String>();//没有泛型，QQ就是object
        gt.setQ("?");
        System.out.println(gt.getQ());
        genericTest<Character> gt1=new genericTest<Character>();
        gt1.setQ('w');
        System.out.println(gt1.getQ());



    }
}

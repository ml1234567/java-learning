package javatest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Abst implements Abs,Abstr{

    @Override
    public void eat() {
        System.out.println("接口的eat方法的重写");
    }

    @Override
    public void run() {
        System.out.println("接口的run方法的重写");
    }
}

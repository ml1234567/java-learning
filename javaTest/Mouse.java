package javatest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Mouse implements USB{


    @Override
    public void start() {
        System.out.println("鼠标开始工作");
    }

    @Override
    public void end() {
        System.out.println("鼠标结束工作");

    }
}

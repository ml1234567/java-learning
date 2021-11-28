package javatest;

public class Keyborad implements USB{
    @Override
    public void start() {
        System.out.println("键盘开始工作");
    }

    @Override
    public void end() {
        System.out.println("键盘停止工作");
    }
}

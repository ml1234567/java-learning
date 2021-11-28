package javatest;


public class Laptop {
    //通过usb接口，来使用其他类的方法
    public void useUSB(USB usb){
        usb.end();
        usb.start();
    }

}


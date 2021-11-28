package javatest;

public class USBTest {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        lap.useUSB(new Keyborad());
        lap.useUSB(new Mouse() );
    }
}

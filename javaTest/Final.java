package javatest;

public class Final {

    public static void main(String[] args) {
        final int m= 200;
        final int []arr= {1,3,5};

        System.out.println(arr[1]);
        arr[1]=0;
        System.out.println(arr[1]);
        final Human hu = new Human();
        //hu=new Human();
        Human hum = new Human();
        hum=new Human();
        hum = new Human();
    }
}

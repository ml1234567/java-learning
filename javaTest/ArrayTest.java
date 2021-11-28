package javatest;

public class ArrayTest {
    public static void main(String[] args) {
        int[] newArray ={1,2,2};
        new ArrayTest();
        //argument(newArray);
        ArrayTest.argument(newArray);
        System.out.println(newArray[1]);
    }

    public static void argument(int arr[]){
        new ArrayTest();
        arr[1]=1001;
    }
}

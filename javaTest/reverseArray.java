package javatest;


public class reverseArray {
    public static void main(String[] args) {
        reverseArray ra=new reverseArray();
        int[]arr={1,4,7,5,6,87,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("********************************");
        ra.reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void reverse(int[] array){
       for(int min=0,max =array.length-1;min<max;min++,max--){
           int temp=array[min];
           array[min]=array[max];
           array[max]=temp;


       }
    }
}

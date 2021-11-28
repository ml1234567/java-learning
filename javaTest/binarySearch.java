package javatest;

public class binarySearch {
    //对于有序数组For an ordered array
    int [] array={1,3,5,7,9,10,18,19,32,65,78};


    public static void main(String[] args) {
        binarySearch bs =new binarySearch();
        System.out.println(bs.searchArray(bs.array, 0));
    }
    public int searchArray(int[] array,int key) {
        int min=0;
        int max=array.length-1;//*

           while(min<=max){
               if(array[(min+max)/2]<key){
                   min=(min+max)/2+1;//*

               }else if(array[(min+max)/2]>key){
                   max=(min+max)/2-1;//*
               }else return (min+max)/2;
           }
        return -1;
        }

    }


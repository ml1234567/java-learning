package javatest;

public class selecteSort {
    //选择排序是一种简单直观的排序算法，无论什么数据进去都是 O(n²) 的时间复杂度。所以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间了吧。
    public static void selectSort(int []arr) {
        //首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
        //
        //再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
        //
        //重复第二步，直到所有元素均排序完毕。
        for (int i = 0; i < arr.length-1; i++) {

            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;

                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[]std={1,4,5,4,3,3555,668,7,8,54,90};
        selectSort(std);
        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i]);
        }
    }
}

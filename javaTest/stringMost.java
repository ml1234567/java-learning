package javatest;

import java.util.Arrays;

public class stringMost {
    public static void main(String[] args) {
        System.out.println(stringMost("ghjeuwiodhhhhdnjkndhhhhe"));
    }
    public static char stringMost(String str){
        //定义26长度的int数组
        int []count=new int [26];
        char[] chars=str.toCharArray();
        for(int i=0;i<str.length();i++){
            char ch=chars[i];
            count[ch-97]++;//非常重要a是97

        }
        System.out.println(Arrays.toString(count));
        //取出count数组中最大值的索引
        int max=count[0];
        int index=0;
        for (int i = 0; i < count.length; i++) {
            if (count[i]>max){
                max=count[i];
                index=i;
            }
        }
        return (char)(index+97);

    }
}

package javatest;

public class stringTes {
    public static void main(String[] args) {
    String  str="kngvklifuytnvhkdlllllllllrjmfnuhvtjk";
    String strs="l";
    int s=stringCount(str,strs);
        System.out.println(s);
    }
    public static int stringCount(String in,String out){
        int count=0;
        int index=0;
        while((index=in.indexOf(out))!=-1){
            count++;
            in=in.substring(index+out.length());//截取字符串，从index返回的值加上串的长度
        }
        return count;
    }
}

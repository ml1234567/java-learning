package javatest;

public class Calculator {
    public int Add(int i, int j){
        int m = i+j;
        System.out.println("i+j="+m);
        return m;
    }
    public int Add(int i, int j,int k){
        int m = i+j+k;
        System.out.println("i+j+k="+m);
        return m;
    }
    public int Add(int ... args){
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + args[i];
        }
        System.out.println("sum="+sum);
        return sum;
    }
}

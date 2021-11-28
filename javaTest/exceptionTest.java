package javatest;

public class exceptionTest {
    public static void main(String[] args) {
        System.out.println(getAver(100,0));
    }
    public static  int getAver(int score, int people){
        if(score<=0||people<=0)
            throw new scoreException("是不是不发火，就把别人当傻子啊");
        return score/people;
    }

}

public class People {
    int age;

    public void study() {
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("age="+age);
    }
    public int addAge(int i){
        age=age+i;
        return i;
    }
}

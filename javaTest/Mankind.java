package javatest;

public class Mankind implements Comparable<Mankind>{
    private String name;
    private int age;
    public Mankind(){}//无参构造器
    public Mankind(String name, int age){
        this.age=age;
        this.name=name;
    }//有参构造器
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mankind{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Mankind o) {
        return o.age-this.age;
    }
}

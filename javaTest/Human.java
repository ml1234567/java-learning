package javatest;

public class Human {
    private int age;
    //int weight;
    private String name;
    public Human() {
    }

    public Human(int age) {
        this.age = age;
    }
    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }


    //
    public void walk(){
        System.out.println("走路");
    }
    @Override
    public String toString() {
        return "age"+age+"name"+name;
    }

    @Override
    public boolean equals(Object obj) {
        //obj向下转型,不然没法进行比较，因为这时候传进来的参数是Object类型的，其实是向上转型了

        Human h=(Human)obj;
        return this.age==h.age;
    }
    /*public boolean equals(Human human){
        return this.age==human.age;
    }*/
}


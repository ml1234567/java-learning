package javatest;
public class Student {
    /**
     * 定义四个成员变量
     */
    String name;
    int age;
    long phone;
    String address;
    /**有参构造方法*/
    public Student(String name, int age, long phone, String address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
        System.out.println(address);
    }
    /**成员变量的get/set方法*/
    public String getName(){
        //访问的是成员变量name
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package javatest;

public class Studenti {


        String name;//成员变量name
        int age;
        public Studenti() {
            name = "daxiao";
            age = 6;
            System.out.println("调用了无参构造器....");
        }

        public Studenti(String name) {
            //调用无参构造方法
            this();
            this.name = name;
            System.out.println("调用了一参构造器");
        }
        public Studenti(String name, int age){
            this("xiaomin");
            this.age = age;
            System.out.println("调用了二参构造器");
        }
        public void printName(){
            System.out.println("姓名：" + name);
        }
        public void printNameAgain(){
            this.printName();
        }
        public static void main(String[] args) {
            Studenti studenti = new Studenti("小明");
            studenti.printName();
            Studenti stu =new Studenti("xdang",5);
            stu.printName();
            stu.printNameAgain();
            Studenti stuu = new Studenti();
            stuu.printNameAgain();
            System.out.println(stuu.age);
        }
    }


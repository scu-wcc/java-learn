package scu.wcc.finaldemo;

public class FinalDemo1 {
    public static void main(String[] args) {
        //final修饰词：被修饰的变量只能赋值一次
        final int a;
        a=10;
        System.out.println(a);
        //a=20;报错
        System.out.println(a);


        final Student s = new Student("张三",23);
        System.out.println(s.getName()+", "+s.getAge());//张三, 23
        s.setName("李四");
        s.setAge(24);
        System.out.println(s.getName()+", "+s.getAge());//李四, 24

        //s = new Student();报错
        Zi z =new Zi();
        z.show();
        z.show("n");
    }

}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

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

    public final void show(){
        System.out.println("Fu-----show");
    }
}

class Zi extends Student{
    //无法重写，同名就报错
    //    public void show(){
    //        System.out.println("Zi-----show");
    //    }
    //但是可以重构
        public void show(String name){
            System.out.println("Zi----show");
        }

}


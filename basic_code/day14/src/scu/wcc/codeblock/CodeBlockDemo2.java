package scu.wcc.codeblock;

public class CodeBlockDemo2 {
    //构造代码块：每次构造类对象的时候都会自动执行；优先于构造方法执行。
    public static void main(String[] args) {
        //构造代码块被多次执行。
        Student t1 =new Student();
        Student t2 = new Student("张三",23);
        //不会调用构造代码块
        Student.id = "heima001";
    }
}


class Student{
    static String id;
    private String name;
    private int age;

    {
        System.out.println("构造代码块");
    }
    public Student(String name, int age) {
        System.out.println("带参构造");
        this.name = name;
        this.age = age;
    }

    public Student(){
        System.out.println("空参构造");
    }


}

package scu.wcc.codeblock;

public class CodeBlockDemo3 {
    public static void main(String[] args) {
        //静态代码块：随着类的加载只会执行一次，用于初始化变量。
        Teacher.id = "heima001";
        Teacher.id = "heima002";
        Teacher t1 =new Teacher();
        Teacher t2 =new Teacher("张三",23);
    }
}


class Teacher{

    static String id;
    private String name;
    private int age;

    static {
        System.out.println("静态代码块");
    }
    public Teacher(String name, int age) {
        System.out.println("带参构造");
        this.name = name;
        this.age = age;
    }

    public Teacher(){
        System.out.println("空参构造");
    }


}

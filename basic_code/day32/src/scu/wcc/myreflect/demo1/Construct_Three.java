package scu.wcc.myreflect.demo1;

public class Construct_Three {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取class对象的三种方式
        //1.Class。forName(全类名)
        Class clazz1 = Class.forName("scu.wcc.myreflect.demo1.Student");
        System.out.println(clazz1);

        //2.类名.class
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        //3.对象.getClass()
        Student stu = new Student();
        Class clazz3 = stu.getClass();
        System.out.println(clazz3);

        System.out.println(clazz1==clazz3); //true
        System.out.println(clazz1==clazz2); //true


    }
}

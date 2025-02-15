package scu.wcc.staticdemo1;

public class StudentTest {
    public static void main(String[] args){
        Student s1 = new Student("张三",23);
        s1.study();
        s1.show(); //null

        //静态变量调用方式：类名.静态变量(推荐); 对象名.静态变量;
        Student.teacherName = "王老师";

        Student s2 = new Student("李四",24);
        s2.study();
        s2.show(); //王老师

        s1.show(); //王老师
    }
}

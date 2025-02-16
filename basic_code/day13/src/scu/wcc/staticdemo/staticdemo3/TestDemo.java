package scu.wcc.staticdemo.staticdemo3;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",23,'男'));
        list.add(new Student("李四",24,'女'));
        list.add(new Student("王五",25,'男'));

        int maxAge = StudentUtil.getMaxStudentAge(list);
        System.out.println("学生中最大年龄是："+ maxAge);
    }
}

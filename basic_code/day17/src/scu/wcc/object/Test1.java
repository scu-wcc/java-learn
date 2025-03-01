package scu.wcc.object;

import java.sql.SQLOutput;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        Student stu1 = new Student("Jack",25);
        Student stu2 = new Student("Jack",25);

        //Object的toString方法默认返回调用者的地址值。
//        String str = stu1.toString();
//        System.out.println(str);
//        System.out.println(stu1);

        //重写toString();
        System.out.println(stu1);

        //equals
        String s="abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb)); //false; sb不是String类，直接false
        System.out.println(s.equals("abc")); //true; "abc"是String类，内容也相同

        System.out.println(sb.equals(s)); //false; 地址不一样
        System.out.println(sb.equals("abc")); // false; 地址不一样

        System.out.println("------------------------------------");

        //重写equals
        //System.out.println(stu1.equals(stu2)); // false
        System.out.println(stu1.equals(stu2));//true


    }
}


class Student{
    String Name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(Name, student.Name);
    }

}

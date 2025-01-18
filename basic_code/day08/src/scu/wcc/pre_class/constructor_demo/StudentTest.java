package scu.wcc.pre_class.constructor_demo;

public class StudentTest {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.getAge()); //0
        System.out.println(s.getName()); //null

        Student s2 =new Student("张三",16);
        System.out.println(s2.getName()); //张三
        System.out.println(s2.getAge()); //16
    }
}

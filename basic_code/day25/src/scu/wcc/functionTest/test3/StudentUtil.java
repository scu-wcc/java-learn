package scu.wcc.functionTest.test3;

public class StudentUtil {
    private StudentUtil(){}

    public static String getRegex(Student stu){
        String name = stu.getName();
        int age = stu.getAge();
        return name+"-"+age;
    }
}

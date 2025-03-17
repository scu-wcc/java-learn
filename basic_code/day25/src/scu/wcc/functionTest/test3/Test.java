package scu.wcc.functionTest.test3;



import java.util.ArrayList;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student("张三",23));
        stuList.add(new Student("李四",24));
        stuList.add(new Student("王五",25));
        stuList.add(new Student("赵六",26));
        stuList.add(new Student("田七",27));

/*        stuList.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                String name = student.getName();
                int age = student.getAge();
                return name+"-"+age;
            }
        }).toArray(String[]::new);*/
        String[] array = stuList.stream().map(StudentUtil::getRegex).toArray(String[]::new);
        for (String s : array) {
            System.out.println(s);
        }
    }
}

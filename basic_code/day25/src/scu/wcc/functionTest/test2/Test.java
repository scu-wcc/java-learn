package scu.wcc.functionTest.test2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student("张三",23));
        stuList.add(new Student("李四",24));
        stuList.add(new Student("王五",25));
        stuList.add(new Student("赵六",26));
        stuList.add(new Student("田七",27));

        String[] array = stuList.stream().map(Student::getName).toArray(String[]::new);
        for (String s : array) {
            System.out.println(s);
        }

    }
}

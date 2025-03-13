package scu.wcc.mapdemo.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HashMap<Student, String> students = new HashMap<>();

        students.put(new Student("张三",23),"广东");
        students.put(new Student("李四",24),"福建");
        students.put(new Student("王五",25),"北京");

        students.put(new Student("张三",23),"江苏");

        for(Map.Entry<Student, String> student : students.entrySet()){
            String name = student.getKey().getName();
            String hometown = student.getValue();
            System.out.println("name:"+name+"，hometown:"+hometown);
        }
    }
}

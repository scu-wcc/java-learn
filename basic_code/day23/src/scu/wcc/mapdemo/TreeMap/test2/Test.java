package scu.wcc.mapdemo.TreeMap.test2;

import java.util.Comparator;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args){

        TreeMap<Student, String> studentStringTreeMap=new TreeMap<>((o1, o2) -> {
                int result = o1.getAge()-o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            });

        Student stu1 = new Student("zhangsan",23);

        Student stu3 = new Student("wangwu",25);
        Student stu2 = new Student("lisi",24);

        Student stu4 = new Student("zhangsan",23);
        Student stu5 = new Student("limeimei",23);

        studentStringTreeMap.put(stu1,"北京");
        studentStringTreeMap.put(stu2,"上海");
        studentStringTreeMap.put(stu3,"广州");
        studentStringTreeMap.put(stu4,"深圳");
        studentStringTreeMap.put(stu5,"重庆");

        System.out.println(studentStringTreeMap);

    }
}

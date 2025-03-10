package scu.wcc.myset.test;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student stu3 = new Student("王五",25);
        Student stu2 = new Student("李四",24);
        Student stu1 = new Student("张三",23);


        Student stu4 = new Student("张三",23);

        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        hs.add(stu4);
        Iterator<Student> it = hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}

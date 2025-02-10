package scu.wcc.arraylist.arraylistdemo.exercise.test3;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("老六",26);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //System.out.println(list); 地址值
        int len = list.size();
        for (int i = 0; i < len; i++) {
            System.out.println(list.get(i).getName()+", "+list.get(i).getAge());
        }
    }
}

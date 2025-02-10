package scu.wcc.arraylist.arraylistdemo.exercise.test3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的姓名：");
            String name = sc.next();
            System.out.println("请输入第"+(i+1)+"个学生的年龄：");
            int age = sc.nextInt();
            Student s = new Student();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }

        int len = list.size();
        for (int i = 0; i < len; i++) {
            System.out.println(list.get(i).getName()+", "+list.get(i).getAge());
        }
    }
}

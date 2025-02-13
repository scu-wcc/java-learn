package scu.wcc.arraylist.homework.HK2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(new Teacher("赵老师","javase"));
        list.add(new Teacher("钱老师","javaee"));
        list.add(new Teacher("孙老师","php"));
        list.add(new Teacher("李老师","python"));
        int len = list.size();
        for (int i = 0; i < len; i++) {
            String name = list.get(i).getName();
            String course = list.get(i).getCourse();
            System.out.println("姓名："+name+"，专业："+course);
        }
    }
}

package scu.wcc.myset.test;

import scu.wcc.myset.Student2;

import java.util.Comparator;
import java.util.TreeSet;

public class Student2Test {
    public static void main(String[] args) {
        //使用比较器比较
        //对学生的成绩进行排序：总分、语文、数学、英语、年龄、姓名；都相同则认为是相同学生。
        TreeSet<Student2> ts = new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                int sum1 = o1.getChinese()+o1.getMath()+o1.getEnglish();
                int sum2 = o2.getChinese()+o2.getMath()+o2.getEnglish();
                int i = sum1-sum2;
                if(i != 0){
                    return i;
                }
                i = o1.getChinese() - o2.getChinese();
                if(i != 0){
                    return i;
                }
                i=o1.getMath()-o2.getMath();
                if(i != 0){
                    return i;
                }
                i=o1.getEnglish() - o2.getEnglish();
                if(i != 0){
                    return i;
                }
                i = o1.getAge() - o2.getAge();
                if(i != 0){
                    return i;
                }
                //调用String重写的compareTo方法
                i = o1.getName().compareTo(o2.getName());
                if(i != 0){
                    return i;
                }
                return 0;
            }
        });

        Student2 stu1 = new Student2("zhangsan",23,69,90,88);
        Student2 stu2 = new Student2("lisi",24,77,95,98);
        Student2 stu3 = new Student2("wangwu",25,99,81,86);
        Student2 stu4 = new Student2("laoliu",26,81,85,63);
        Student2 stu5 = new Student2("zhangsan",23,69,90,88);
        Student2 stu6 = new Student2("zhangsan",32,69,90,88);

        System.out.println(ts.add(stu1));
        System.out.println(ts.add(stu2));
        System.out.println(ts.add(stu3));
        System.out.println(ts.add(stu4));
        System.out.println(ts.add(stu5));//false
        System.out.println(ts.add(stu6));//true


        for(Student2 stu:ts){
            int sum = stu.getChinese()+stu.getMath()+stu.getEnglish();
            System.out.println("当前总分："+sum);
            System.out.println(stu);
            System.out.println("---------------------------------------------------------------");

        }
    }
}

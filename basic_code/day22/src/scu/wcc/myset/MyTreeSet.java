package scu.wcc.myset;

import scu.wcc.genericsdemo.genericsclassdemo.tongpeifudemo.Teddy;

import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
//        TreeSet<Integer> ts = new TreeSet<>();
//        ts.add(2);
//        ts.add(1);
//        ts.add(5);
//        ts.add(4);
//        ts.add(3);
//        System.out.println(ts);

        TreeSet<Student> ts = new TreeSet<>();

        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("lisi",24);
        Student stu3 = new Student("wangwu",25);
        Student stu4 = new Student("zhaoliu",26);

        //没有定义比较元素，报错：Student cannot be cast to class java.lang.Comparable
        ts.add(stu1);
        ts.add(stu2);
        //存入stu3后红黑树发生调整，根节点改变。
        ts.add(stu3);
        //当stu4存入的时候，红黑树的根节点是stu4
        ts.add(stu4);

        System.out.println(ts);
    }
}

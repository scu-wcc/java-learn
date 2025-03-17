package scu.wcc.funtiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A05_Demo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三,23");
        list.add("李四,24");
        list.add("胡一菲,35");
        list.add("曾小贤,21");
        list.add("菲比,40");


        List<Student> newList = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList);
    }
}

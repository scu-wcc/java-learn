package scu.wcc.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {

    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();

        coll.add(new Student("张三",23));
        coll.add(new Student("李四",24));
        coll.add(new Student("王五",25));


        System.out.println(coll.contains(new Student("张三",23)));//没重写equals前：false; 重写equals后：true
    }


}

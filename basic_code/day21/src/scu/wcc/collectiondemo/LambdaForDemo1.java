package scu.wcc.collectiondemo;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Consumer;

public class LambdaForDemo1 {
    public static void main(String[] args) {
        Collection<String> coll = new HashSet<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("abc");

        //使用匿名内部类遍历
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //使用lambda遍历
        //Consumer是一个@FunctionalInterface的函数式接口，只有一个抽象方法
        //底层会遍历集合得到每个元素，并将元素传入accept方法中
        coll.forEach(s -> System.out.println(s));
    }
}

package scu.wcc.myexception.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"interface","Mary","class","computer");
        list.stream().map(String::toUpperCase).forEach(System.out::println);


    }

}

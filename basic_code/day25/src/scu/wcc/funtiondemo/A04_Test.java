package scu.wcc.funtiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class A04_Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"0","22","6","3","21","1","5","10");

        A04_ObjectDemo a04 = new A04_ObjectDemo();
        a04.getRightData(list);

    }
}

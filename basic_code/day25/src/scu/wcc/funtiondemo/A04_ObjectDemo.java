package scu.wcc.funtiondemo;

import java.util.ArrayList;

public class A04_ObjectDemo extends A04_Super{
    public void getRightData(ArrayList<String> list){
        list.stream().map(super::getNumber).filter(this::getBIg).forEach(System.out::println);
    }

    public boolean getBIg(int n){
        return n>4;
    }
}

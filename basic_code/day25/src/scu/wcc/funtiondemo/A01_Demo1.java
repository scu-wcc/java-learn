package scu.wcc.funtiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class A01_Demo1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,5,6,8,4,1,3,8,2,8,2);
        Collections.sort(list,A01_Demo1::subtraction);
        //等价于：Collections.sort(list, (n1,n2)-> n2-n1);
        System.out.println(list);


    }

    public static int subtraction(int num1, int num2){
        return num2- num1;

    }

}

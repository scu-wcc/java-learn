package scu.wcc.genericsdemo.genericsclassdemo.tongpeifudemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 =new ArrayList<>();
        ArrayList<Fu> list2 =new ArrayList<>();
        ArrayList<Zi> list3 =new ArrayList<>();
        ArrayList<String> list4 =new ArrayList<>();


        method(list1);
        method(list2);
        method(list3);
        //method(list4);

    }

    public static void method(ArrayList<? super Zi> list){

    }
}



class Ye{

}
class Fu extends Ye{

}
class Zi extends Fu{

}

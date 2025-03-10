package scu.wcc.genericsdemo.genericsclassdemo;

public class MyListTest {
    public static void main(String[] args) {
        MyList1 list1 =  new MyList1();
        list1.add("aaa"); //调用的时候方法指定是String类型

        MyList2<Integer> list2 = new MyList2();
        list2.add(1); //未确定泛型类型：Object；确定类型：相应类型

    }
}

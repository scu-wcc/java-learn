package scu.wcc.genericsdemo.genericsclassdemo;

public class Test {
    public static void main(String[] args) {
        //确定E的类型
//        MyArrayList<String> list = new MyArrayList<>();
//
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");
//
//        System.out.println(list.get(2));
//        System.out.println(list.toString());
        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(123);
        list2.add(456);
        list2.add(788);
        list2.add(111);

        list2.get(2);
        System.out.println(list2.toString());
    }
}

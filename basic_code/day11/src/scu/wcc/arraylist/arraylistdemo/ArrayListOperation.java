package scu.wcc.arraylist.arraylistdemo;

import java.util.ArrayList;

public class ArrayListOperation {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //增：boolean add(E e)
        boolean result1 = list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        //list.add(123);报错
        //只要添加的是已经限定好的泛型E，就一定返回true
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //System.out.println(result1);

        //删：boolean remove(E e);删除指定的元素，返回是否成功删除。
        //    E remove(int index);删除指定索引的元素，返回被删除的元素。
        boolean result2 = list.remove("aaa"); //只删除第一个碰到的，不会全部删除
        System.out.println(result2); //true;
        boolean result3 = list.remove("eee"); //试图删除不存在元素时会报错
        System.out.println(result3); //false

        String deleteElement = list.remove(0);
        System.out.println(deleteElement); // "aaa"

        //改：E set(int index, E e);将指定索引位置的元素修改为指定的E，并返回原来的元素。
        String setElement = list.set(2,"mmm");
        System.out.println(setElement); //ccc

        //查：E get(int index); 获取指定索引的元素
        //    int size():获取集合的长度
        String getElement = list.get(3);
        System.out.println(getElement); // ddd
        //System.out.println(list.get(6));越界报错

        System.out.println(list.size());

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //aaa bbb mmm ddd




    }

}

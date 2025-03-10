package scu.wcc.genericsdemo.genericsclassdemo;

import java.util.Arrays;

/*
 * E:一个不确定类型，创建对象时由传入类型确定
 *
 */
public class MyArrayList <E>{
    Object[] obj = new Object[10];

    int size;

    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    //将返回值强转成E类型,java底层也是这样干的。
    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}

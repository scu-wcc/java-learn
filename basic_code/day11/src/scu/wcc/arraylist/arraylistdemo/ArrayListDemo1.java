package scu.wcc.arraylist.arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args){
        //集合：一个长度可变的容器，用来存储特定的内容。
        //泛型E：指定集合中存储的数据内容
        //注：集合中无法直接存储基本数据类型，需要使用它们的包装类
        //标准写法：
        ArrayList<String> list = new ArrayList<String>();
        //JDK7之后可以这样写：省略后一个ArrayList<E>中的泛型E。
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println(list);
    }
}

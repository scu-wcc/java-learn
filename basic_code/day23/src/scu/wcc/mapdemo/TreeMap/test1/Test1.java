package scu.wcc.mapdemo.TreeMap.test1;

import java.util.Comparator;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        //升序
        TreeMap<Integer,String> goodsTreeMap1 = new TreeMap<>();

        goodsTreeMap1.put(5,"手机");
        goodsTreeMap1.put(8,"电脑");
        goodsTreeMap1.put(3,"数码相机");
        goodsTreeMap1.put(1,"电饭锅");

        System.out.println(goodsTreeMap1);

        //降序
        TreeMap<Integer,String> goodsTreeMap2=new TreeMap<>((o1, o2) -> o2-o1);

        goodsTreeMap2.put(5,"手机");
        goodsTreeMap2.put(8,"电脑");
        goodsTreeMap2.put(3,"数码相机");
        goodsTreeMap2.put(1,"电饭锅");
        System.out.println(goodsTreeMap2);
    }
}

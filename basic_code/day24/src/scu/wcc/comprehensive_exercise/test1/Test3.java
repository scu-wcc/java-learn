package scu.wcc.comprehensive_exercise.test1;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"东方魂","小金毛","鸽鸽","篮标语","鹤开文","粥街轮","牢大","贝利亚","奶龙","胖猫");

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            list2.add(i);
        }

        Collections.shuffle(list2);
        // System.out.println(list2);

        for (int i = 0; i < 3; i++) {
            System.out.println("==============第"+(i+1)+"轮点名开始了==============");
            for (int j = 0; j < list1.size(); j++) {
                String name = list1.get(list2.get(j));
                System.out.println(name);
            }
            Collections.shuffle(list2);
        }
    }
}

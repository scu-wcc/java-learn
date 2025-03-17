package scu.wcc.comprehensive_exercise.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"东方魂","小金毛","鸽鸽","篮标语","鹤开文","粥街轮","牢大","贝利亚","奶龙","胖猫");


        //1.使用Random
        Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));


        //使用shuffle
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}

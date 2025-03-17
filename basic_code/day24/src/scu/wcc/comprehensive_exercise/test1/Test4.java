package scu.wcc.comprehensive_exercise.test1;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //集合嵌套
        //定义集合存储省(key),以及对应的市(value)

        HashMap<String, ArrayList<String>> provincesMap =  new HashMap<>();

        //江苏省
        ArrayList<String> city1 = new ArrayList<>();

        //广东省
        ArrayList<String> city2 = new ArrayList<>();

        //四川省
        ArrayList<String> city3 = new ArrayList<>();

        Collections.addAll(city1,"南京市","苏州市","无锡市");
        Collections.addAll(city2,"广州市","深圳市","东莞市");
        Collections.addAll(city3,"成都市","宜宾市","绵阳市");

        provincesMap.put("江苏省",city1);
        provincesMap.put("广东省",city2);
        provincesMap.put("四川省",city3);
        // System.out.println(provincesMap);

        Set<Map.Entry<String, ArrayList<String>>> entries = provincesMap.entrySet();

        for(Map.Entry<String, ArrayList<String>> entry : entries){
            String province = entry.getKey();
            ArrayList<String> city = entry.getValue();

            StringJoiner sj = new StringJoiner(", ","","");
            //用循环获取市
            for (String s : city) {
                sj.add(s);
            }
            String result = sj.toString();

            System.out.println(province+" = "+result);

        }

    }
}

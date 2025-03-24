package scu.wcc.newcrawl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        //使用第三方包完成网络爬虫
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //Hutool包中的爬取
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //Hutool包中的正则表达式
        List<String> familyTempList = ReUtil.findAll("(\\W{4})(，|。)", familyNameStr, 1);
        List<String> boyTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr, 1);
        List<String> girlTempList = ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

        ArrayList<String> familyNameList = new ArrayList<>();
        for (String s : familyTempList) {
            for (int i = 0; i < 4; i++){
                char c = s.charAt(i);
                familyNameList.add(c+"");
            }
        }
        //System.out.println(familyNameList);

        ArrayList<String> boyNameList = new ArrayList<>();
        for (String s : boyTempList) {
            if(!boyNameList.contains(s)){
                boyNameList.add(s);
            }
        }
        //System.out.println(boyNameList);

        ArrayList<String> girlNameList = new ArrayList<>();
        for (String s : girlTempList) {
            String[] names = s.split(" ");
            for (String name : names) {
                girlNameList.add(name);
            }
        }
        //System.out.println(girlNameList);

        ArrayList<String> list =  getInfo(familyNameList,boyNameList,girlNameList,20,30);

        Collections.shuffle(list);

        //Hutool包的写入
        FileUtil.writeLines(list,"java-learn\\basic_code\\IOTest\\Hutoolnames.txt","UTF-8");

    }

    private static ArrayList<String> getInfo(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        Random random = new Random();
        int familyLen = familyNameList.size();

        HashSet<String> boyHS =new HashSet<>();
        int boyLen = boyNameList.size();
        while(true){
            if(boyHS.size() ==boyCount){
                break;
            }
            boyHS.add(familyNameList.get(random.nextInt(familyLen)) + boyNameList.get(random.nextInt(boyLen)));
        }
        //System.out.println(boyHS);




        HashSet<String> girlHS =new HashSet<>();
        int girlLen = girlNameList.size();
        while(true){
            if(girlHS.size() == girlCount){
                break;
            }
            girlHS.add(familyNameList.get(random.nextInt(familyLen)) + girlNameList.get(random.nextInt(girlLen)));
        }
        //System.out.println(girlHS);

        ArrayList<String> resultList = new ArrayList<>();

        for (String boy : boyHS) {
            String name = boy+"-男-"+ (random.nextInt(10)+18);
            resultList.add(name);
        }

        for (String girl : girlHS) {
            String name = girl+"-女-"+ (random.nextInt(8)+18);
            resultList.add(name);
        }



        return resultList;
    }
}

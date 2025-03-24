package scu.wcc.newcrawl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //定义变量记录网站
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = netCrawler(familyNameNet);
        String boyNameStr = netCrawler(boyNameNet);
        String girlNameStr = netCrawler(girlNameNet);

        //利用正则表达式，获取正确的数据
        ArrayList<String> familyTempList = getName(familyNameStr, "(\\W{4})(，|。)", 1);
        //System.out.println(familyTempList);
        ArrayList<String> boyTempList = getName(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        //System.out.println(boyTempList);
        ArrayList<String> girlTempList = getName(girlNameStr, "(.. ){4}..", 0);
        //System.out.println(girlTempList);


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

        ArrayList<String> list =  getInfo(familyNameList,boyNameList,girlNameList,5,5);

        Collections.shuffle(list);
        //System.out.println(list);


        //使用BufferedWriter的newLine()也可以换行。
        PrintWriter pw =new PrintWriter(new FileWriter("IOTest\\names.txt"),true);
        for (String name : list) {
            pw.println(name);
        }
        pw.close();

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

    /*
    *形参1:
    *   爬取到的数据
    * 形参2：
    *   正则表达式
    * 形参3：
    *   通过正则表达式得到数据的组序
    *
     */
    private static ArrayList<String> getName(String NameStr, String regex , int index) {

        ArrayList<String> list =new ArrayList<>();
        //获取正则表达式对象
        Pattern pattern = Pattern.compile(regex);
        //输入爬取的文本
        Matcher matcher = pattern.matcher(NameStr);

        while(matcher.find()){
            String group = matcher.group(index);
            list.add(group);
        }

        return list;
    }


    //定义方法,网络爬取数据
    /*
    形参:
        网站
    返回值:
        爬取到的数据
     */
    public static String netCrawler(String net) throws IOException {
        //1. 定义StringBuilder拼接爬取到的对象
        StringBuilder sb = new StringBuilder();

        //2.创建URL对象
        URL url =new URL(net);

        //3.连接上这个网站
        URLConnection conn = url.openConnection();

        //4.读取数据：将网站的字节流读取转换成字符流
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());

        int ch;
        while((ch = isr.read())!=-1){
            sb.append((char)ch);
        }

        return sb.toString();

    }





}

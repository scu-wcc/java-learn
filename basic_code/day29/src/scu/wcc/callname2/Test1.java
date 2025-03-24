package scu.wcc.callname2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IOTest\\names.txt"));
        String str;
        ArrayList<String> infoList = new ArrayList<>();
        while ((str = br.readLine()) != null) {
            infoList.add(str);
        }
        br.close();

        int boyCount = 0;
        int girlCount = 0;
        int sum = 0;

        ArrayList<Integer> numList =new ArrayList<>();
        Collections.addAll(numList,0,0,0,1,1,1,1,1,1,1);
        Collections.shuffle(numList);

        Random r = new Random();
        int numLen = numList.size();
        int infoLen = infoList.size();

        while(sum<1000000) {
            int numIndex = r.nextInt(numLen);
            int infoIndex = r.nextInt(infoLen);
            String gender = infoList.get(infoIndex).split("-")[1];
            int num = numList.get(numIndex);

            if(num==0 && gender.equals("女")){
                girlCount++;
                sum++;

            }else if(num==1 && gender.equals("男")){
                boyCount++;
                sum++;
            }


        }

        double boyRatio = (boyCount*1.0) / (sum*1.0);
        System.out.println("点到男生的概率："+boyRatio);

        double girlRatio = (girlCount*1.0) / (sum*1.0);
        System.out.println("点到女生的概率："+girlRatio);
    }
}

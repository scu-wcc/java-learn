package scu.wcc.callname3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IOTest\\names.txt"));
        String str;
        ArrayList<String> nameList = new ArrayList<>();
        while((str = br.readLine())!=null){
            String name = str.split("-")[0];
            nameList.add(name);
        }
        br.close();
        Random r = new Random();
        int len = nameList.size();

        int i=0;
        while(i<3){

            if(i==2){
                System.out.println("张三");
                i++;
                continue;
            }
            String name = nameList.get(r.nextInt(len));
            if(name.equals("张三")){
                System.out.println(name);
                i++;
                continue;
            }

            System.out.println(name);
            i++;
        }

    }
}

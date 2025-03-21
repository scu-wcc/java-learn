package scu.wcc.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //操作纯文本文件使用字符流
        FileReader fr = new FileReader("IOTest/sortNumber.txt");
        StringBuffer sb = new StringBuffer();
        int b;
        while((b=fr.read())!=-1){
            sb.append((char)b);
        }
        fr.close();
        System.out.println(sb);

        String[] strArr = sb.toString().split("-");
        System.out.println(Arrays.toString(strArr));
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : strArr) {
            list.add(Integer.parseInt(s));
        }

        Collections.sort(list);
        System.out.println(list);

        StringJoiner sj = new StringJoiner("-","","");
        for (Integer i : list) {
            sj.add(i+"");
        }

        FileWriter fw = new FileWriter("IOTest/sortNumber.txt");
        fw.write(sj.toString());
        fw.close();
    }
}

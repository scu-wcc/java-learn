package scu.wcc.buffertest;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Test2_2 {
    public static void main(String[] args) throws IOException {
        //将出师表恢复顺序
        BufferedReader br = new BufferedReader(new FileReader("bufferIOTest\\csb.txt"));
        String line;

        //使用treeMap直接排序
        TreeMap<Integer,String> tm = new TreeMap<>();


        while((line=br.readLine())!=null){
            int num = Integer.parseInt(line.split("\\.")[0]);
            tm.put(num,line);
        }


        BufferedWriter bw =new BufferedWriter(new FileWriter("bufferIOTest\\csb_copy2.txt"));

        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }

        bw.close();
        br.close();
    }

    public static void printList(List<String> list){
        for (String s : list) {
            System.out.println(s);
        }
    }
}

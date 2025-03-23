package scu.wcc.buffertest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //将出师表恢复顺序
        BufferedReader br = new BufferedReader(new FileReader("bufferIOTest\\csb.txt"));
        String line;
        ArrayList<String> randomList=new ArrayList<>();
        while((line=br.readLine())!=null){
            randomList.add(line);
        }
        //printList(randomList);
        List<String> sortList = randomList.stream()
                .sorted((String o1, String o2) -> Integer.parseInt(o1.charAt(0) + "") - Integer.parseInt(o2.charAt(0) + ""))
                .collect(Collectors.toList());

        printList(sortList);

        BufferedWriter bw =new BufferedWriter(new FileWriter("bufferIOTest\\csb_copy.txt"));
        for (String s : sortList) {
            bw.write(s);
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

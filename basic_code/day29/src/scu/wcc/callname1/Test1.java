package scu.wcc.callname1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

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
        Collections.shuffle(nameList);
        System.out.println(nameList.get(0));

    }
}

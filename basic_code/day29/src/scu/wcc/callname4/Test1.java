package scu.wcc.callname4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Test1 {
    public static void main(String[] args) throws IOException {
        //所有学生的姓名
        ArrayList<String> nameList = new ArrayList<>();
        //已经被点过的学生姓名
        ArrayList<String> calledList= new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("IOTest/names.txt"));
        String info ;
        while((info = br.readLine())!=null){
            nameList.add(info.split("-")[0]);
        }
        br.close();


        BufferedReader brCalled = new BufferedReader(new FileReader("basic_code/day29/src/scu/wcc/callname4/called.txt"));
        String nameCalled ;
        while((nameCalled=brCalled.readLine())!=null){
            calledList.add(nameCalled);
        }
        brCalled.close();


        for (String name : calledList) {
            if(nameList.contains(name)){
                nameList.remove(name);
            }
        }

        if(nameList.size()!=0){
            Collections.shuffle(nameList);
            String nameCalling = nameList.get(0);
            System.out.println(nameCalling);
            PrintWriter pw = new PrintWriter(new FileWriter("basic_code/day29/src/scu/wcc/callname4/called.txt",true));
            pw.println(nameCalling);
            pw.close();
        }else {
            Collections.shuffle(calledList);
            System.out.println(calledList.get(0));
        }

    }

}

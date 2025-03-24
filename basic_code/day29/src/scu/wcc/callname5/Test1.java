package scu.wcc.callname5;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //定义集合统一管理学生
        ArrayList<Student> stuList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("IOTest\\names.txt"));
        String line;
        while ((line = br.readLine())!=null){
            String[] stu = line.split("-");
            stuList.add(new Student(stu[0],stu[1],Integer.parseInt(stu[2]),Double.parseDouble(stu[3])));
        }
        br.close();


        double sumWeight=0;
        for (Student student : stuList) {
            sumWeight+= student.getWeight();
        }

        //设置每个学生的权重
        double[] arr = new double[stuList.size()];
        int index=0;
        for (Student student : stuList) {
            arr[index] = student.getWeight()/sumWeight;
            index++;
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i]+arr[i-1];
        }


        //获取被点名的学生
        int number = (int)(Math.random()*stuList.size());
        /*
        *使用二分查找法:(不如我的，二分查找可能导致number为负数)
        * 当key不在集合中时:
        * 结果值 = -应插入的位置 - 1；
        * 则应该插入的位置 = -结果值 -1；
        * int number = -Arrays.binarySearch(arr,Math.random())-1;
         */


        Student stu  = stuList.get(number);
        System.out.println(stu.getName());
        double weight = stu.getWeight()/2;
        stu.setWeight(weight);

        BufferedWriter bw = new BufferedWriter(new FileWriter("IOTest\\names.txt"));
        for (Student student : stuList) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();

    }
}

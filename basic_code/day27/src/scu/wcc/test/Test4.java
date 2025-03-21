package scu.wcc.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) throws IOException {
        //使用Stream流来完成Test3
        FileReader fr =new FileReader("IOTest\\sortNumber.txt");
        StringBuilder sb =new StringBuilder();

        int i ;
        while((i= fr.read())!=-1){
            sb.append((char)i);
        }

        System.out.println(sb);
        //Stream: 单列集合:自带的；数组:工具类的；
        Integer[] array = Arrays.stream(sb.toString()
                                            .split("-"))
                                            .map(Integer::parseInt)
                                            .sorted().toArray(Integer[]::new);

        //写出
        String str = Arrays.toString(array);
        System.out.println(str);
        str = str.replace(", ", "-");
        str = str.substring(1,str.length()-1);
        System.out.println(str);

        FileWriter fw = new FileWriter("IOTest\\sortNumber.txt");
        fw.write(str);
        fw.close();
        fr.close();
    }



}

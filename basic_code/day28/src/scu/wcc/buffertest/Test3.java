package scu.wcc.buffertest;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("bufferIOTest\\count.txt"));
        String line = br.readLine();
        br.close();

        int count = Integer.parseInt(line);
        count++;
        if(count<=3){
            System.out.println("欢迎使用本软件，这是您第"+count+"次使用。");
        }else{
            System.out.println("本软件只能免费使用三次，如需再次使用请充值。");
        }

        BufferedWriter bw =new BufferedWriter(new FileWriter("bufferIOTest\\count.txt"));
        bw.write(count+"");
        bw.close();
    }
}

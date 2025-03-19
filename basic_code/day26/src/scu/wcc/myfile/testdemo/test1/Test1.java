package scu.wcc.myfile.testdemo.test1;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("basic_code/day26/src/scu/wcc/myfile/testdemo/test1/aaa");
        System.out.println(file.mkdir());
        File file1 = new File(file,"a.txt");

    }

}

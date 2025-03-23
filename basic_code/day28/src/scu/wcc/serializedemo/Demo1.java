package scu.wcc.serializedemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        //创建序列化输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializeFile\\a.txt"));

        Student stu = new Student("张三",33,"北京");

        //oos.write(97);

        oos.writeObject(stu);


        oos.close();
    }
}

package scu.wcc.serializedemo.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MultiplyObjectSerializableDemo {
    public static void main(String[] args) throws IOException {
        //一次将多个对象序列化到本地文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializeFile\\test.txt"));

/*
        将对象单个序列化会导致反序列化时不知道应该读取几次，导致EOFException
        oos.writeObject(new Person("张三",23,"北京"));
        oos.writeObject(new Person("李四",24,"南京"));
        oos.writeObject(new Person("王五",25,"深圳"));
*/

        //使用集合，将对象打包序列化
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",23,"北京"));
        list.add(new Person("李四",24,"南京"));
        list.add(new Person("王五",25,"深圳"));

        oos.writeObject(list);

        oos.close();

    }
}

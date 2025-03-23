package scu.wcc.serializedemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializeFile\\a.txt"));
        Object stu = ois.readObject();
        System.out.println(stu);
    }
}

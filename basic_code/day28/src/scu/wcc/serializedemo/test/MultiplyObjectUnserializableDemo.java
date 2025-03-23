package scu.wcc.serializedemo.test;



import java.io.*;
import java.util.ArrayList;

public class MultiplyObjectUnserializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //从本地文件中读取多个对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializeFile\\test.txt"));

/*        Person stu1 = (Person) ois.readObject();
        Person stu2 = (Person) ois.readObject();
        Person stu3 = (Person) ois.readObject();

        //尝试读取第四个:EOFException
        Person stu4 = (Person) ois.readObject();
        System.out.println(stu4);

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);*/

        //直接读取集合
        ArrayList<Person> list = (ArrayList<Person>)ois.readObject();

        for (Person person : list) {
            System.out.println(person);
        }

    }
}

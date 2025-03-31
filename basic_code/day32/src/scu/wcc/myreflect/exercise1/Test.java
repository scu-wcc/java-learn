package scu.wcc.myreflect.exercise1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.Buffer;

public class Test {

    public static void main(String[] args) throws IllegalAccessException, IOException {
        Student stu = new Student("张三",23,'男',188.2,"游泳");
        Teacher t = new Teacher("李四",10000);

        saveInfo(stu);

    }


    public static void saveInfo(Object obj) throws IllegalAccessException, IOException {

        Class clazz = obj.getClass();

        BufferedWriter bw = new BufferedWriter(new FileWriter("basic_code/day32/src/scu/wcc/myreflect/exercise1/a.txt"));


        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);

            //获取成员变量的名字
            String name = field.getName();
            //获取成员变量的值
            Object value = field.get(obj);
            bw.write(name+"="+value);
            bw.newLine();
        }
        bw.close();

    }

}

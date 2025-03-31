package scu.wcc.myreflect.demo3;

import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class clazz = Class.forName("scu.wcc.myreflect.demo3.Student");

        //利用反射获取成员变量
/*        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/

/*        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }*/

        Field name = clazz.getDeclaredField("name");
        System.out.println(name);


        Student stu =new Student("张三",123,'男');
        name.setAccessible(true);

        //可以获取对象中该字段的值
        String stuName = (String) name.get(stu);
        System.out.println(stuName);

        //修改相依对象中的字段值
        name.set(stu,"李四");
        System.out.println(stu);
    }

}

package scu.wcc.myreflect.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("scu.wcc.myreflect.demo2.Student");

        //获取构造方法

/*        Constructor[] con1 = clazz.getConstructors();
        for (Constructor constructor : con1) {
            System.out.println(constructor);
        }*/
/*
        Constructor[] con2 = clazz.getDeclaredConstructors();
        for (Constructor constructor : con2) {
            System.out.println(constructor);
        }
*/

        Constructor con1 = clazz.getConstructor();
        System.out.println(con1);

        Constructor<?> con2 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(con2);


        //获取构造方法的权限
        System.out.println(con1.getModifiers());
        System.out.println(con2.getModifiers());


        //使用构造方法创建对象
        //取消私有化构造的限制,这样就能通过私有化构造方法构造对象
        //暴力反射：临时取消权限的检查
        con2.setAccessible(true);
        Student stu = (Student)con2.newInstance("张三", 23);
        System.out.println(stu);

        Parameter[] parameters = con2.getParameters();

        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

    }


}

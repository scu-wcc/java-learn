package scu.wcc.myannotationdemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {

        Class<?> clazz = Class.forName("scu.wcc.myannotationdemo.MyTestClass");

        Method[] methods = clazz.getDeclaredMethods();
/*        for (Method method : methods) {
            System.out.println(method);
        }*/

        MyTestClass mys = new MyTestClass();

        for (Method method : methods) {
            method.setAccessible(true);


            if(method.isAnnotationPresent(MyTest.class)){
                method.invoke(mys);
            }
        }

    }
}

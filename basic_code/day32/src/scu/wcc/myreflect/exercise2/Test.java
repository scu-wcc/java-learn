package scu.wcc.myreflect.exercise2;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Properties prop = new Properties();
        FileReader fr =new FileReader(new File("basic_code/day32/src/scu/wcc/myreflect/exercise2/a.properties"));
        prop.load(fr);
        fr.close();
        System.out.println(prop);
        String className = (String) prop.get("className");
        String methodName = (String) prop.get("method");

        //1.创建class对象
        Class clazz = Class.forName(className);
        //2.获取空参构造
        Constructor con = clazz.getDeclaredConstructor();
        con.setAccessible(true);
        //3.创建对象
        Object o = con.newInstance();
        //4.获取方法
        Method method = clazz.getDeclaredMethod(methodName);
        //5.调用方法
        method.invoke(o);


    }


}

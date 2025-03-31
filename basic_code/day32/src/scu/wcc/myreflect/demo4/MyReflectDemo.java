package scu.wcc.myreflect.demo4;



import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class clazz = Class.forName("scu.wcc.myreflect.demo4.Student");

/*        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        Method sleep = clazz.getMethod("sleep");
        System.out.println(sleep);

        //私有的方法要使用Declared获取
        Method eat = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(eat);

        System.out.println(eat.getName());
        System.out.println(eat.getModifiers());
        System.out.println(eat.getReturnType());
        System.out.println(eat.getParameterCount());


        Student stu = new Student();
        eat.setAccessible(true);
        Object result = eat.invoke(stu, "耙耙柑");
        System.out.println(result);


    }

}

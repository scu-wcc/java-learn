package scu.wcc.loggingdemo;

public class Test2 {
    public static void main(String[] args) {

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        //获取平台类加载器
        ClassLoader classLoader1 = systemClassLoader.getParent();

        //获取启动类加载器
        ClassLoader classLoader2 = classLoader1.getParent();


        System.out.println("系统类加载器"+systemClassLoader);
        System.out.println("平台类加载器"+classLoader1);
        System.out.println("启动类加载器"+classLoader2);//null
        //System.out.println(classLoader2.getParent()); //报错：null调用方法
    }
}

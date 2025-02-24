package scu.wcc.homework.homework5;

public class Test {
    public static void main(String[] args){

       A a = new A();
       //方法1：匿名内部类
       a.methodA(new InterA() {
           @Override
           public void showA() {
               System.out.println("使用匿名内部类实现--showA...");
           }
       });

       //方法2：普通实现类
        InterAImpl iai = new InterAImpl();
        a.methodA(iai);

        a.methodA(() -> System.out.println("Lambda 表达式实现的 showA() 方法被调用"));

    }
}

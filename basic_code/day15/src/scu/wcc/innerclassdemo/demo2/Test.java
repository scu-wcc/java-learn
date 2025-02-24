package scu.wcc.innerclassdemo.demo2;

public class Test {
    public static void main(String[] args) {
        //生成成员内部类的方式
        Car.Engine ce = new Car().new Engine();

        ce.show();
    }
}

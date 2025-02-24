package scu.wcc.innerclassdemo.demo2;

public class Car {
    String name;
    int age;
    int a = 10;

    class Engine{
        String engineName;
        int a = 20;
        public void show(){
            int a = 30;
            System.out.println(a); //30
            System.out.println(this.a); //20
            System.out.println(Car.this.a); //10
        }

        //使用方法返回内部类的实例化对象
        public Engine getInstances(){
            return new Engine();
        }
    }
}

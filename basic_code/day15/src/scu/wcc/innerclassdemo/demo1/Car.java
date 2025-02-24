package scu.wcc.innerclassdemo.demo1;

public class Car {
    private String name;
    private int age;
    String carColor;

    public void show(){
        System.out.println(name);
        System.out.println(age);
        Engine e = new Engine();
        //外部类无法直接使用内部类的成员，必须先创建对象。
        //System.out.println(engineAge);
        System.out.println(e.engineAge);
    }
    class Engine{
        String engineName;
        private int engineAge;

        public void show(){
            //内部类可以直接使用外部类的成员，包括私有
            System.out.println(name);
            System.out.println(carColor);
            System.out.println(engineName);
        }
    }
}

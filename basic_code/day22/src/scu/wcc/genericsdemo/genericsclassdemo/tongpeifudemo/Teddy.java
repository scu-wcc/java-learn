package scu.wcc.genericsdemo.genericsclassdemo.tongpeifudemo;

public class Teddy extends Dog{
    public Teddy() {
        setBleed("泰迪");
    }
    public Teddy(String name, int age, String bleed){
        setName(name);
        setAge(age);
        setBleed(bleed);
    }

    @Override
    public void eat() {
        setSomething("骨头");
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的"+getBleed()+"正在吃"+getSomething()+"，边吃边蹭");
    }
}

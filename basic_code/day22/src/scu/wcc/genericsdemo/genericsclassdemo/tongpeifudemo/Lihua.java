package scu.wcc.genericsdemo.genericsclassdemo.tongpeifudemo;

public class Lihua extends Cat{
    public Lihua() {
        setBleed("狸花猫");
    }
    public Lihua(String name, int age, String bleed){
        setName(name);
        setAge(age);
        setBleed(bleed);
    }

    @Override
    public void eat() {
        setSomething("鱼");
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的"+getBleed()+"正在吃"+something);
    }
}

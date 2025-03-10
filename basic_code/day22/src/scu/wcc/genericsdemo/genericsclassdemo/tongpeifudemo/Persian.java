package scu.wcc.genericsdemo.genericsclassdemo.tongpeifudemo;

public class Persian extends Cat{
    public Persian() {
        setBleed("波斯猫");
    }
    public Persian(String name, int age, String bleed){
        setName(name);
        setAge(age);
        setBleed(bleed);
    }

    @Override
    public void eat() {
        setSomething("小饼干");
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的"+getBleed()+"正在吃"+getSomething());
    }
}

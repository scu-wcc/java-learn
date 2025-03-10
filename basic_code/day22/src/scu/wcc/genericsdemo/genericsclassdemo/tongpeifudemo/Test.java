package scu.wcc.genericsdemo.genericsclassdemo.tongpeifudemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Husky h = new Husky("xxx",2,"哈士奇");
        Teddy t = new Teddy("XXX",3,"泰迪");

        Persian p = new Persian("xxx",6,"波斯猫");
        Lihua l = new Lihua("xxx",4,"狸花猫");

        ArrayList<Animal> list = new ArrayList<>();
        list.add(h);
        list.add(t);
        list.add(p);
        list.add(l);

        keepPet(list);


    }
    public static void keepPet(ArrayList<? extends Animal> list){
        for(Animal a : list){
            a.eat();
        }
    }
}

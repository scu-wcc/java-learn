package scu.wcc.oop_abstract;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args){

        //抽象类无法直接创建实例化对象
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("吃吧");
            }
        };


        Sheep s = new Sheep("小羊",4);
        s.eat();
        s.drink();

    }
}

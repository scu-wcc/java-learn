package scu.wcc.innerclassdemo.anonymousdemo;

public class AnonymousTest {

    public static void main(String[] args){

        //匿名内部类：1.继承/实现关系；2.重写方法；3.创建对象。
        new Animal(){
            @Override
            public void eat() {
                System.out.println("吃东西");
            }
        //可以直接调用方法
        }.eat();

        //可以使用多态来接收匿名内部类成员
        Swim s = new Swim(){
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        };
        s.swim();


        method(new Animal("狗狗",3){

            //匿名内部类的成员没有意义，无法调用(多态编译看父类)
            public final String food = "骨头";

            public String getFood() {
                return food;
            }

            @Override
            public void eat() {
                System.out.println(getName()+"正在吃"+getFood());
            }
        });


        new Animal() {
            @Override
            public void eat() {
                System.out.println("动物吃东西");
            }
        };


    }

    public static void method(Animal a){
        a.eat();
    }

}

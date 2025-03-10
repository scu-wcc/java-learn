package scu.wcc.genericsdemo.genericsclassdemo.tongpeifudemo;

public class Test2
{
    public static void main(String[] args) {
        method(new Husky());
    }

    public static <E extends Animal> void method(E e){

    }
}

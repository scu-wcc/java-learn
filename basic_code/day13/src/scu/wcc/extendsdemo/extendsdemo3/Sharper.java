package scu.wcc.extendsdemo.extendsdemo3;

public class Sharper extends Dog{
    @Override
    public void eat() {
        //复用父类的代码
        super.eat();
        System.out.println("狗在吃骨头！");
    }
}

package scu.wcc.homework.homework6;

//定义一个接口
interface InterB {
    void showB();
}

//目标：调用成员方法methodB
class B {
    InterB b;
    public B(InterB b){
        this.b = b;
    }
    public void methodB(){
        b.showB();
    }
}
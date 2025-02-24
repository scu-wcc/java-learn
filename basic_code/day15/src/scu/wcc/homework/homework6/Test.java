package scu.wcc.homework.homework6;

public class Test {
    public static void main(String[] args) {
        InterB ib =new InterB() {
            @Override
            public void showB() {

            }
        };
        B b1 = new B(ib);
        System.out.println(b1.b);//Test$1@41629346;创建了一个匿名内部类

        B b = new B(new InterB() {
            @Override
            public void showB() {
                System.out.println("showB");
            }
        });
        b.methodB();
        System.out.println(b.b);//
    }
}

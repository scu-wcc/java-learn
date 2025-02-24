package scu.wcc.homework.homework4;

interface Inter {
    void show();
}
class Outer {

//    static class Inner implements Inter{
//
//        @Override
//        public void show() {
//            System.out.println("HelloWorld");
//        }
//    }
    public static Inter method(){
        return new Inter(){

            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}
public class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}

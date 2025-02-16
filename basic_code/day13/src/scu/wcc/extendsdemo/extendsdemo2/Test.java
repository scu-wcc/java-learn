package scu.wcc.extendsdemo.extendsdemo2;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三",23,"北京");

        System.out.println(s.getAddress());
        System.out.println(s.age);
        System.out.println(s.name);
        //System.out.println(s.address); 私有化成员变量无法直接调用。
        s.PeopleShow();
        s.show();
    }
}

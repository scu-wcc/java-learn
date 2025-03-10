package scu.wcc.myset;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("张三",23);

        //计算每个对象的哈希值
        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());

        //当哈希值相同，就会导致哈希碰撞
        System.out.println("abc".hashCode()); //96354
        System.out.println("acD".hashCode()); //96354
    }
}

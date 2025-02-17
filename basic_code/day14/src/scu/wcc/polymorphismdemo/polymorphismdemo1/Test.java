package scu.wcc.polymorphismdemo.polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s =new Student();
        s.setName("申小豹");
        s.setAge(14);

        Teacher t = new Teacher();
        t.setAge(30);
        t.setName("王老五");


        Administrator admin = new Administrator();
        admin.setName("管理员");
        admin.setAge(27);

        //多态：父类类型可以接收子类对象，调用方法时使用的是子类重写后的方法
        register(s);
        register(t);
        register(admin);

    }

    public static void register(People p ){
        System.out.println(p.id );
        p.show();
    }
}

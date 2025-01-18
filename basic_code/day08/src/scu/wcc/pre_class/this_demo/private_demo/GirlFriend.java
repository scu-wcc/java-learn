package scu.wcc.pre_class.this_demo.private_demo;

public class GirlFriend {
    //就近原则：方法在调用变量的时候会优先使用离得近的
    //使用this关键字可以调用成员变量，避免就近原则
    //this本质：所在方法调用者的地址值
    //this类似一个变量，记录着调用者的地址，在使用this.xxx时，实际上是：地址值.xxx，这样就可以找到相应对象的成员变量了

    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        //被this修饰的是成员变量，没有this修饰的会优先选择局部变量
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void sleep() {
        System.out.println("女朋友在睡觉。");
    }

    public void eat() {
        System.out.println("女朋友在吃饭。");
    }

}

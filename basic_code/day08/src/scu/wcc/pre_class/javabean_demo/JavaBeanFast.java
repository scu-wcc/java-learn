package scu.wcc.pre_class.javabean_demo;

public class JavaBeanFast {
    //alt+insert(+fn):可以快速生成JavaBean
    private String name;
    private int age;

    public JavaBeanFast() {
    }

    public JavaBeanFast(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package scu.wcc.serializedemo;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {

    //固定序列号
    private static final long serialVersionUID = -1861310362820050574L;
    private String name;
    private int age;

    transient private String address;


    public Student() {
    }

    public Student( String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student{"+ "name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}

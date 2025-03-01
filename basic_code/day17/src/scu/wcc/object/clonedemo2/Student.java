package scu.wcc.object.clonedemo2;

import java.util.Arrays;
import java.util.Objects;

public class Student implements Cloneable{

    private String name;
    private String password;

    private int age;
    private int[] data;

    public Student(String name, String password, int age, int[] data) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.data = data;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student user = (Student) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(password, user.password) && Arrays.equals(data, user.data);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student stu = (Student)super.clone();
        int[] arr = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            arr[i] = data[i];
        }
        stu.data = arr;
        return stu;
    }
}

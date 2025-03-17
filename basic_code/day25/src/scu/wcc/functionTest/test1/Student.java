package scu.wcc.functionTest.test1;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String str){
        this.name = str.split(",")[0];
        this.age =Integer.parseInt(str.split(",")[1]);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

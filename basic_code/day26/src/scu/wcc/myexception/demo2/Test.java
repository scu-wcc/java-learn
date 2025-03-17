package scu.wcc.myexception.demo2;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(0);
    }
}

class Student{

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

        if(age>50 || age<18){
            throw new RuntimeException();
        }else{
            this.age = age;
        }


    }
}
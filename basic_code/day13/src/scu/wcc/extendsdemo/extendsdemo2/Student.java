package scu.wcc.extendsdemo.extendsdemo2;

public class Student extends People{

    String name;
    public Student() {
    }

    public Student(String name, int age, String address) {
        super(name,age,address);
        this.age = age+1;
        this.name = "子类名字中："+name;
        //this.address = address;//无法直接使用
        //super.address = address;报错
    }

    public void show(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
}

package scu.wcc.pre_class.this_demo.private_demo;

public class Student {
    private String name;

    public void method(String name){
        //System.out.println(name);
        System.out.println(this.name); //null
    }
}

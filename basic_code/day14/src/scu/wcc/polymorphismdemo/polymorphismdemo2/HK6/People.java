package scu.wcc.polymorphismdemo.polymorphismdemo2.HK6;

public class People {
    private String name;
    private int age;

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

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
    }

    //多态
    public void keepPet(Animal a, String something){

        if(a instanceof Dog d){
            d.eat(something);
            d.lookHome();
        }else if(a instanceof Cat c){
            c.eat(something);
            c.catchMouse();
        }
    }


}

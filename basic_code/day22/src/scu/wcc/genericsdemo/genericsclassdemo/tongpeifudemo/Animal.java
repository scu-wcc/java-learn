package scu.wcc.genericsdemo.genericsclassdemo.tongpeifudemo;

public abstract class Animal {
    private String name;
    private int age;
    private String bleed;
    String something;

    public Animal(String name, int age, String bleed) {
        this.name = name;
        this.age = age;
        this.bleed = bleed;
    }

    public Animal() {
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

    public String getBleed() {
        return bleed;
    }

    public void setBleed(String bleed) {
        this.bleed = bleed;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public abstract void eat();
}


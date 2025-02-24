package scu.wcc.abs_interface;

public abstract class Coach extends People{
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }

    public abstract void teach();
}

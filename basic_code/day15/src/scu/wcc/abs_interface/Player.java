package scu.wcc.abs_interface;

public abstract class Player extends People{
    public Player(String name, int age) {
        super(name, age);
    }

    public Player() {
    }

    public abstract void study();
}

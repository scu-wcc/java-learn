package scu.wcc.abs_interface;

public class BasketballPlayer extends Player{
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public BasketballPlayer() {
    }

    @Override
    public void study(){
        System.out.println("学打篮球");
    }
}

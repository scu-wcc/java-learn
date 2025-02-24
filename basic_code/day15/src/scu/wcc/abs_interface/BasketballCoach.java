package scu.wcc.abs_interface;

public class BasketballCoach extends Coach{
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}

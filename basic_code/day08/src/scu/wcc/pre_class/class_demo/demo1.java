package scu.wcc.pre_class.class_demo;

public class demo1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        System.out.println(phone1.brand); // null
        System.out.println(phone1.price); // 0.0

        phone1.brand="小米";
        phone1.price=1899.99;
        System.out.println(phone1.brand);
        System.out.println(phone1.price);

        phone1.playGame();
        phone1.call();

        Phone phone2 = new Phone();
        phone2.playGame();
    }
}

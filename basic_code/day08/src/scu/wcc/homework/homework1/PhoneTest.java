package scu.wcc.homework.homework1;

public class PhoneTest {
    public static void main(String[] args){
        Phone p = new Phone();
        p.setBrand("小米");
        p.setPrice(3998);
        p.setColor("黑色");
        p.call();
        p.sendMessage();
    }
}

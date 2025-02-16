package scu.wcc.extendsdemo.homework.HK3;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("小米",1899);

        System.out.println(p1.size);//6
        p1.call();
        p1.playGame();

        p1.size = 8;
        System.out.println(Phone.size);//8
    }
}

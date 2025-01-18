package scu.wcc.pre_class.class_demo;

public class GirlFriendTest {
    public static void main(String[] args){
        GirlFriend gf1 = new GirlFriend();
        gf1.name="皮皮";
        gf1.age=18;
        gf1.height=180;
        gf1.gender="貔貅";
        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.height);
        System.out.println(gf1.gender);

        gf1.eat();
        gf1.hang();
        gf1.sleep();
    }
}

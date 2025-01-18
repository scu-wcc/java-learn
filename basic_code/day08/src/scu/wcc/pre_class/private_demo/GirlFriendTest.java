package scu.wcc.pre_class.private_demo;

import scu.wcc.pre_class.private_demo.GirlFriend;

public class GirlFriendTest {
    public static void main(String[] args){

        GirlFriend gf1 = new GirlFriend();
        gf1.setName("小石石");
        gf1.setAge(-18);
        gf1.setGender("男");

        System.out.println(gf1);
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.sleep();
        gf1.eat();

    }
}

package scu.wcc.arraylist.arraylistdemo.exercise.test4;

import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 =new User("1","zhangsan","123456");
        User u2 =new User("2","lisi","11111");
        User u3 =new User("3","wangwu","abcdefg");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        boolean result1 = contains(list, "1");
        System.out.println(result1); //true

        boolean result2 = contains(list, "6");
        System.out.println(result2); //false

    }

    public static boolean contains(ArrayList<User> list, String id){
        int len = list.size();
        for (int i = 0; i < len; i++) {
            boolean flag = list.get(i).getId().equals(id);
            if(flag){
                return true;
            }
        }
        return false;
    }
}

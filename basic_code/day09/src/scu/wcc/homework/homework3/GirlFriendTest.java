package scu.wcc.homework.homework3;

public class GirlFriendTest {
    public static void main(String[] args){
        GirlFriend[] gfArr = new GirlFriend[4];
        gfArr[0] = new GirlFriend("张三", 18,'女', "游泳");
        gfArr[1] = new GirlFriend("李四", 27,'男', "吃零食");
        gfArr[2] = new GirlFriend("王五", 32,'女', "睡觉");
        gfArr[3] = new GirlFriend("老六",21 ,'男', "逛街");

        int sum = 0;
        for(GirlFriend gf : gfArr){
            sum+=gf.getAge();
        }
        double avg = sum*1.0 / gfArr.length;
        System.out.println("n朋友的平均年龄："+avg);

        int count =0;
        for(GirlFriend gf:gfArr){
            if(gf.getAge()<avg){
                count++;
                System.out.println("姓名："+gf.getName()+"，年龄："+gf.getAge()
                        +"，性别："+gf.getGender()+"，爱好："+gf.getHobbit());
            }
        }
    }
}

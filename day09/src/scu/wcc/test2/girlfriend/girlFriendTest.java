package scu.wcc.test2.girlfriend;

public class girlFriendTest {
    public static void main(String[] args) {
        GirlFriend g1 =new GirlFriend("张三",21,"女","游泳");
        GirlFriend g2 =new GirlFriend("李四",30,"男","跑步");
        GirlFriend g3 =new GirlFriend("王五",17,"🐻","唱歌");
        GirlFriend g4 =new GirlFriend("老六",24,"猪","写作");

        GirlFriend[] arr = new GirlFriend[]{g1,g2,g3,g4};

        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }

        double avg = sum*1.0 / arr.length;

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge()<avg){
                count++;
                System.out.println(arr[i].getName()+","+arr[i].getAge()+","+arr[i].getGender()+","+arr[i].getHobby());
            }
        }
        System.out.println("一共有"+count+"个比平均年龄低");
    }
}

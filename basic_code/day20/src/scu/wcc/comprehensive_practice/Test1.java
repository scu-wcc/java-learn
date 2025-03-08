package scu.wcc.comprehensive_practice;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {

    GirlFriend g1 = new GirlFriend("zhangsan",23,1.68);
    GirlFriend g2 = new GirlFriend("lisi",24,1.75);
    GirlFriend g3 = new GirlFriend("liushishi",18,1.71);
    GirlFriend g4 = new GirlFriend("abc",23,1.68);

    GirlFriend[] arr= {g1,g2,g3,g4};
    Arrays.sort(arr,((o1, o2) -> {
        double temp=o1.getAge()-o2.getAge();
        temp = temp==0?o1.getHeight()-o2.getHeight():temp;
        temp = temp==0?o1.getName().compareTo(o2.getName()):temp;
        if(temp>0){
            return 1;
        } else if (temp<0) {
            return -1;
        }else{
            return 0;
        }
    }));
        System.out.println(Arrays.toString(arr));
    }

}

class GirlFriend{
    private String name;
    private int age;
    private double height;

    public GirlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String  toString(){
        return "GirlFriend{name:"+name+", age:"+age+", height:"+height;
    }
}

package scu.wcc.homework.homework2;

public class PhoneTest {
    public static void main(String[] args){
        Phone[] phoneArr = new Phone[3];
        phoneArr[0] = new Phone("小米", 1899,"红色");
        phoneArr[1] = new Phone("苹果", 7999,"土豪金");
        phoneArr[2] = new Phone("华为", 5888,"蓝色");

        int sum =0;
        for(Phone p:phoneArr){
            sum+=p.getPrice();
        }
        double avg = sum*1.0 / phoneArr.length;
        System.out.printf("三部手机的平均价格是：%.3f",avg);

    }
}

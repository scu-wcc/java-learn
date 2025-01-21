package scu.wcc.test2.car;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] carsArr =new Car[3];

        //Java中键盘录入有两套体系：
        //第一套：nextInt,nextDouble,next:遇到制表符，空格，回车就不会接收后面的内容,并且会将其顺延往下。
        //第一套体系中接收上一个键盘录入的顺延内容时会自动舍弃开头的空格，制表符和回车，所以不会少一次键盘录入。

        //第二套：nextLine:遇到回车才停止接收数据。
        //由于nextLine接收顺延数据时不会自动舍弃空格，制表符和回车，所以两套混用会导致回车传递而少一次键盘录入。


        for (int i = 0; i < carsArr.length; i++) {
            System.out.println("请输入第"+(i+1)+"辆车的品牌：");
            String brand = sc.next();
            System.out.println("请输入第"+(i+1)+"辆车的价格：");
            int price = sc.nextInt();
            System.out.println("请输入第"+(i+1)+"辆车的颜色：");
            String color = sc.next();
            Car car = new Car(brand,price,color);
            carsArr[i] = car;
        }

        for (int i = 0; i < carsArr.length; i++) {
            System.out.println(carsArr[i].getBrand()+","+carsArr[i].getPrice()+","+carsArr[i].getColor());
        }
    }
}

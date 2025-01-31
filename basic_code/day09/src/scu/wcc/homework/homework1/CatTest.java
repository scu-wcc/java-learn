package scu.wcc.homework.homework1;

import java.util.Scanner;

public class CatTest {
    public static void main(String[] args){
        Car[] carArr=new Car[3];

        Scanner sc = new Scanner(System.in);
        int carArrLen = carArr.length;
        for (int i=0;i<carArrLen; i++){
            Car car = new Car();
            System.out.print("请输入第"+(i+1)+"辆车的品牌：");
            String brand = sc.next();
            car.setBrand(brand);

            System.out.print("请输入第"+(i+1)+"辆车的价格：");
            double price = sc.nextDouble();
            car.setPrice(price);

            System.out.print("请输入第"+(i+1)+"辆车的颜色：");
            String color = sc.next();
            car.setColor(color);

            carArr[i] = car;

        }
        printArrInfo(carArr);
    }

    public static void printArrInfo(Car[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println("第"+(i+1)+"辆车的品牌是："+arr[i].getBrand()+", 价格是："+arr[i].getPrice()+", 颜色是："+arr[i].getColor());
        }
    }
}

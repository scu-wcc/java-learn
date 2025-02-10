package scu.wcc.arraylist.arraylistdemo.exercise.test5;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args){
        ArrayList<Phone> list = new ArrayList<>();
        list.add(new Phone("小米",1000));
        list.add(new Phone("苹果",8000));
        list.add(new Phone("锤子",2999));

        ArrayList<Phone> getPhoneInfList = getPhoneInf(list);
        for (int i = 0; i < getPhoneInfList.size(); i++) {
            System.out.println(getPhoneInfList.get(i).getBrand()+", "+getPhoneInfList.get(i).getPrice());
        }

    }

    public static ArrayList<Phone> getPhoneInf(ArrayList<Phone> list){
        //定义一个集合，用来接收符合要求的数据类型，并返回。
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int price = list.get(i).getPrice();
            if(price<3000){
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}

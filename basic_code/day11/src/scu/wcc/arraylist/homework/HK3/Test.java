package scu.wcc.arraylist.homework.HK3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<Worker> list = new ArrayList<Worker>();
        list.add(new Worker("张三",3000));
        list.add(new Worker("李四",3500));
        list.add(new Worker("王五",4000));
        list.add(new Worker("赵六",4500));
        list.add(new Worker("田七",5000));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals("王五")){
                list.get(i).setName("王小五");
            }
            if(list.get(i).getName().equals("赵六")){
                list.remove(i);
            }
            if(list.get(i).getName().equals("田七")){
                int salary = list.get(i).getSalary();
                list.get(i).setSalary(salary+500);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名："+list.get(i).getName()+", 工资："+list.get(i).getSalary());
        }
    }
}

package scu.wcc.object.clonedemo2;

import com.google.gson.Gson;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅克隆
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        User u1 = new User("zhangsan","123",23,arr);
        User u2 = (User)u1.clone();

        System.out.println(u1);//data=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(u2);//data=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        arr[0] = 100;
        System.out.println(u1);//data=[100, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(u2);//data=[100, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        //u1,u2的data指向同一片地址空间


        System.out.println("------------------------------------------------------");
        //深克隆
        int[] arr2={0,1,2,3,4,5,6,7,8,9};
        Student stu1 = new Student("lisi","1234",24,arr2);

        Student stu2 = (Student)stu1.clone();
        System.out.println(stu1);//data=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(stu2);//data=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        arr2[0] = 100;
        System.out.println(stu1);// data=[100, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(stu2);// data=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        //stu1和stu2的data指向不同的地址空间


        System.out.println("------------------------------------------------------------------------");
        //使用第三方工具
        Gson gson = new Gson();
        String s = gson.toJson(u1);
        User u3 = gson.fromJson(s,User.class);
        System.out.println(u1);//[100, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(u3);//[100, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        arr[0] = 200;
        System.out.println(u1);//[200, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(u3);//[100, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}

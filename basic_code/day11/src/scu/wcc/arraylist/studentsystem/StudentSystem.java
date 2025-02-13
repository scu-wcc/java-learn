package scu.wcc.arraylist.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        String getChar;
        loop:while (true){
            System.out.println("```\n" +
                    "\"-------------欢迎来到黑马学生管理系统----------------\"\n" +
                    "\"1：添加学生\"\n" +
                    "\"2：删除学生\"\n" +
                    "\"3：修改学生\"\n" +
                    "\"4：查询学生\"\n" +
                    "\"5：退出\"\n" +
                    "```");
            System.out.print("\"请输入您的选择:\"\n" );
            String userChoose = sc.next();
            switch(userChoose){
                case "1": {
                    addStudent(studentList);
                    System.out.println("按回车键回到主菜单......");
                    getChar = sc.nextLine();
                    getChar = sc.nextLine();

                    break;
                }
                case "2": {
                    deleteStudent(studentList);
                    System.out.println("按回车键回到主菜单......");
                    getChar = sc.nextLine();
                    getChar = sc.nextLine();
                    break;
                }
                case "3": {
                    updateStudent(studentList);
                    System.out.println("按回车键回到主菜单......");
                    getChar = sc.nextLine();
                    getChar = sc.nextLine();
                    break;
                }
                case "4":{
                    queryStudent(studentList);
                    System.out.println("按回车键回到主菜单......");
                    getChar = sc.nextLine();
                    getChar = sc.nextLine();
                    break;
                }
                case "5": {
                    System.out.println("再见！！！");
                    break loop;
                }
                default:
                    System.out.println("没有该选项，请重新输入！");

            }

        }


    }

    public static int contains(ArrayList<Student> studentList, String id){
        int len = studentList.size();
        for (int i = 0; i < len; i++) {
            if(studentList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public static void addStudent(ArrayList<Student> studentList){
        String id;
        String name;
        int age;
        String address;

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入学生id:");
            id = sc.next();
            if(contains(studentList,id)!= -1){
                System.out.println("当前id存在，请重新录入。");
            }else{
                break;
            }
        }
            System.out.println("请输入学生的姓名:");
            name = sc.next();
            System.out.println("请输入学生的年龄:");
            age = sc.nextInt();
            System.out.println("请输入学生的家庭住址:");
            address = sc.next();
            Student stu = new Student(id,name,age,address);
            studentList.add(stu);
            System.out.println("添加成功！");

    }

    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id:");
        String id = sc.next();
        int IDIndex = contains(list,id);
        if(IDIndex== -1){
            System.out.println("id不存在，删除失败！");
        }else{
            list.remove(IDIndex);
            System.out.println("删除成功！");
        }
    }

    public static void updateStudent(ArrayList<Student> studentList){
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        String address;
        System.out.println("请输入要更改的学生id：");
        String id = sc.next();
        int IDIndex = contains(studentList,id);
        if(IDIndex == -1){
            System.out.println("当前id不存在，无法更改。");
        }else{
            System.out.println("请输入更改后的学生姓名:");
            name = sc.next();
            System.out.println("请输入更改后的学生年龄:");
            age = sc.nextInt();
            System.out.println("请输入更改后学生家庭住址:");
            address = sc.next();
            studentList.get(IDIndex).setName(name);
            studentList.get(IDIndex).setAge(age);
            studentList.get(IDIndex).setAddress(address);
            System.out.println("更改成功！！");
        }
    }

    public static void queryStudent(ArrayList<Student> studentList){
        int len = studentList.size();
        if(len == 0){
            System.out.println("当前无学生信息，请添加后再查询。");
        }else{
            System.out.println("id\t\t\t"+"姓名\t"+"年龄\t"+"家庭住址\t");
            for (int i = 0; i < len; i++) {
                System.out.println(studentList.get(i).getId()+"\t"+studentList.get(i).getName()+"\t"+studentList.get(i).getAge()+"\t"+studentList.get(i).getAddress()+"\t");
            }
        }
    }
}

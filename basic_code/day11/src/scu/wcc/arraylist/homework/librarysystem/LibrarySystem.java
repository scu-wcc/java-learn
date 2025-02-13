package scu.wcc.arraylist.homework.librarysystem;

import scu.wcc.arraylist.studentsystem.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        loop:while(true){
            System.out.println("--------------------------图书管理系统--------------------");
            System.out.println("1.添加图书");
            System.out.println("2.删除图书");
            System.out.println("3.修改图书信息");
            System.out.println("4.查询图书图书");
            System.out.println("5.退出");

            String choose = sc.next();
            switch(choose){
                case "1" -> addBook(list);
                case "2" -> deleteBook(list);
                case "3" -> updateBook(list);
                case "4" -> queryBook(list);
                case "5" -> {
                    break loop;
                }
                default -> System.out.println("没有这个选项！");



            }

        }

    }

    public static boolean contains(ArrayList<Book> list,String id){

        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Book> list,String id){
        int len = list.size();
        for (int i = 0; i < len; i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public static void addBook(ArrayList<Book> list){
        String id;
        String bookName;
        String writerName;
        int price;

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入书本编号id:");
            id = sc.next();
            if(contains(list,id)){
                System.out.println("当前id存在，请重新录入。");
            }else{
                break;
            }
        }
        System.out.println("请输入书本的书名:");
        bookName = sc.next();
        System.out.println("请输入书本的作者:");
        writerName = sc.next();
        System.out.println("请输入书本的价格:");
        price = sc.nextInt();
        Book book = new Book(id,bookName,writerName,price);
        list.add(book);
        System.out.println("添加成功！");

    }

    public static void deleteBook(ArrayList<Book> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的书籍编号:");
        String id = sc.next();
        int IDIndex = getIndex(list,id);
        if(IDIndex== -1){
            System.out.println("id不存在，删除失败！");
        }else{
            list.remove(IDIndex);
            System.out.println("删除成功！");
        }
    }

    public static void updateBook(ArrayList<Book> list){
        Scanner sc = new Scanner(System.in);
        String id;
        String bookName;
        String writerName;
        int price;
        System.out.println("请输入要更改的书籍编号：");
        id = sc.next();
        int IDIndex = getIndex(list,id);
        if(IDIndex == -1){
            System.out.println("当前id不存在，无法更改。");
        }else{
            System.out.println("请输入更改后的书籍名称:");
            bookName = sc.next();
            System.out.println("请输入更改后的书记作者:");
            writerName = sc.next();
            System.out.println("请输入更改后书籍价钱:");
            price = sc.nextInt();
            list.get(IDIndex).setBookName(bookName);
            list.get(IDIndex).setWriterName(writerName);
            list.get(IDIndex).setPrice(price);
            System.out.println("更改成功！！");
        }
    }

    public static void queryBook(ArrayList<Book> list){
        int len = list.size();
        if(len == 0){
            System.out.println("当前无书籍信息，请添加后再查询。");
        }else{
            System.out.println("id\t\t\t"+"书名\t"+"作者\t"+"价格\t");
            for (int i = 0; i < len; i++) {
                System.out.println(list.get(i).getId()+"\t"+list.get(i).getBookName()+"\t"+list.get(i).getWriterName()+"\t"+list.get(i).getPrice()+"\t");
            }
        }
    }
}



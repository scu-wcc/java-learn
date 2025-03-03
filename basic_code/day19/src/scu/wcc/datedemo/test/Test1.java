package scu.wcc.datedemo.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        // 用于存储提取出的 1~100 之间的整数
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // 定义正则表达式，用于匹配 1~100 之间的整数
        String regex = "(?<!\\d)([1-9]|[1-9]\\d|100)(?!\\d)";
        Pattern p = Pattern.compile(regex);
        int sum = 0;

        while (true) {
            System.out.println("请输入一串字符：");
            String userInput = sc.nextLine();
            Matcher m = p.matcher(userInput);

            // 遍历匹配结果
            while (m.find()) {
                String matchStr = m.group();
                int num = Integer.parseInt(matchStr);
                list.add(num);
                sum += num;

                if (sum > 200) {
                    System.out.println("输入的数字和为: " + sum);
                    System.out.println("输入的数字和已超过200，停止输入。");
                    return;
                }
            }
        }
    }
}
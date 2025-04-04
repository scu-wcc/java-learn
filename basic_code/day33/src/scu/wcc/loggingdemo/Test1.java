package scu.wcc.loggingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Test1 {

    public static final Logger LOGGER = LoggerFactory.getLogger("Test1.class");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String name = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();

        if("zhangsan".equals(name) && "123".equals(password)){

            LOGGER.info("用户与2025年11月11日 11点11分登录成功，用户名为"+name+", 密码为"+password);
        }else{
            LOGGER.info("用户与2025年11月11日 11点11分登录失败，用户名为"+name+", 密码为"+password);
        }

    }
}

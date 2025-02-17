package scu.wcc.studentsystem.updatestudentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserRegisterSystem {
    private static final String LOGIN = "1";
    private static final String REGISTER = "2";
    private static final String FORGET_PASSWORD = "3";
    private static final String QUERY_USER = "4";
    private static final String QUIT = "5";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userArrayList = new ArrayList<>();

        String choose;
        loop:
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作:\n1登录 \n2注册 \n3忘记密码 \n4查询用户信息 \n5退出");
            choose = sc.next();
            switch (choose) {
                case LOGIN -> login(userArrayList);
                case REGISTER -> register(userArrayList);
                case FORGET_PASSWORD -> forgetPassword(userArrayList);
                case QUERY_USER -> queryUser(userArrayList);
                case QUIT -> {
                    break loop;
                }
                default -> System.out.println("没有这个选项！");
            }
        }
    }

    public static boolean contains(ArrayList<User> list, String userName) {

        return getIndex(list, userName) >= 0;
    }

    public static int getIndex(ArrayList<User> list, String userName) {
        int len = list.size();
        for (int i = 0; i < len; i++) {
            if (list.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean checkUserName(String userName) {
        int len = userName.length();
        if (len < 3 || len > 15) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            char c = userName.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                if (c >= 'A') {
                    count++;
                }
            } else {
                return false;
            }
        }
        return count >= 1;
    }

    public static boolean checkIdCard(String idCard) {
        int len = idCard.length();
        if (len != 18) {
            return false;
        }
        //str.startWith("0")也可以判断身份证的开头是否为"0"
        if (idCard.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c = idCard.charAt(i);
            if (i == len - 1) {
                if (c == 'x' || c == 'X' || (c >= '0' && c <= '9')) {
                    continue;
                }
            } else {
                if (c < '0' || c > '9') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        int len = phoneNumber.length();
        if (len != 11) {
            return false;
        }
        if (phoneNumber.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c = phoneNumber.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static void register(ArrayList<User> list) {
        System.out.println("-----------------------欢迎注册------------------");
        Scanner sc = new Scanner(System.in);
        String userName;
        String password;
        String passwordCheck;
        String idCard;
        String phoneNumber;

        while (true) {
            System.out.println("请输入用户名：");
            userName = sc.next();
            if (contains(list, userName)) {
                System.out.println("当前用户名已存在。");
                System.out.println("1.重新输入用户名");
                System.out.println("2.回到主菜单");
                String choose = sc.next();
                if (choose.equals("1")) {
                    continue;
                } else if (choose.equals("2")) {
                    return;
                } else {
                    System.out.println("没有这个选项");
                }
            } else if (checkUserName(userName)) {
                break;
            }
            System.out.println("输入用户名不合法，用户名长度必须在3~15位之间,并且必须存在字母。");
        }
        while (true) {
            System.out.println("第一次输入密码：");
            password = sc.next();
            System.out.println("再次输入密码：");
            passwordCheck = sc.next();
            if (password.equals(passwordCheck)) {
                break;
            } else {
                System.out.println("两次输入密码不一致，请重新输入。");
            }
        }

        while (true) {
            System.out.println("请输入身份证号码：");
            idCard = sc.next();
            if (!checkIdCard(idCard)) {
                System.out.println("输入的身份证号码不正确，请重新输入！");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("请输入手机号：");
            phoneNumber = sc.next();
            if (!checkPhoneNumber(phoneNumber)) {
                System.out.println("输入的手机号码不正确，请重新输入！");
            } else {
                break;
            }
        }

        User user = new User(userName, password, idCard, phoneNumber);
        list.add(user);
        System.out.println("注册成功！！！");

    }

    public static void login(ArrayList<User> list) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char) (i + 'a');
            } else {
                chs[i] = (char) (i + 'A' - 26);
            }
        }


        String userName;
        String password;
        String identifyingCode;
        int count = 3;
        while (count > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            userName = sc.next();
            if (!contains(list, userName)) {
                System.out.println("当前用户名未注册，请先注册。");
                return;
            }
            System.out.println("请输入密码：");
            password = sc.next();

            StringBuilder sb =new StringBuilder();
            Random r = new Random();
            int randomIndex = r.nextInt(5);
            for (int i = 0; i < 5; i++) {
                if (i == randomIndex) {
                    sb.append(""+r.nextInt(10));
                } else {
                    sb.append(""+chs[r.nextInt(52)]);
                }
            }
            String systemIdentifyingCode = sb.toString();

            while (true) {
                System.out.println("请输入验证码：" + systemIdentifyingCode);
                identifyingCode = sc.next();
                if (identifyingCode.equalsIgnoreCase(systemIdentifyingCode)) {
                    break;
                } else {
                    System.out.println("当前验证码不正确，请重新输入。");
                }
            }
            int index = getIndex(list, userName);
            if (!list.get(index).getUserPassword().equals(password)) {
                count--;
                System.out.println("用户名或密码错误，还剩下" + (count) + "次机会。");
            } else {
                System.out.println("登陆成功！");
                StudentSystem.startStudentSystem();
                break;
            }

        }
    }

    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName;
        String idCard;
        String phoneNumber;

        userName = sc.next();
        if (!contains(list, userName)) {
            System.out.println("当前用户名不存在！");
            return;
        }

        int userIndex = getIndex(list, userName);
        System.out.println("请输入身份证号码：");
        idCard = sc.next();
        System.out.println("请输入电话号码：");
        phoneNumber = sc.next();

        if (list.get(userIndex).getUserIDNumber().equals(idCard) && list.get(userIndex).getPhoneNumber().equals(phoneNumber)) {
            System.out.println("请输入修改后的密码：");
            String password = sc.next();
            list.get(userIndex).setUserPassword(password);
            System.out.println("密码修改成功！");
        } else {
            System.out.println("账号信息不匹配，修改失败。");
        }

    }

    public static void queryUser(ArrayList<User> list) {
        int len = list.size();
        System.out.println("用户名\t\t密码\t\t身份证号码\t\t\t电话号码");
        for (int i = 0; i < len; i++) {
            User user = list.get(i);
            System.out.println(user.getUserName() + "\t" + user.getUserPassword() + "\t" + user.getUserIDNumber() + "\t" + user.getPhoneNumber());
        }
    }
}
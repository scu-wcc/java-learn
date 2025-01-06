package scu.wcc.arithmeticoperator;

public class CharDemo1 {
    public static void main(String[] args) {
        //字符参与运算的时候会自动提升到int类型
        //char，byte，short同上
        char c= 'C';
        int i = c +3; //没报错，说明计算的时候char自动提升成int，计算结果也是int类型
        System.out.println(i);
        System.out.println(1+ 'a'); //98：字符运算
        System.out.println('a'+"abc"); //aabc：字符串参与运算，拼接操作
    }
}

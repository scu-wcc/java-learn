package scu.wcc.arithmeticoperator;

public class LogicDemo1 {
    public static void main(String[] args){
        //& | ^ !
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 & flag2); //false
        System.out.println(flag1 | flag2); //true
        System.out.println(flag1 ^ flag2); //true
        System.out.println(!flag1); //false
    }
}

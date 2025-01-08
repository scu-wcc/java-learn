package scu.wcc.homework;

public class HW9 {
    public static void main(String[] args) {
        for (int i = 1949; i <=2019; i++) {
            if((2019-i)%12 == 0){
                System.out.println(i+"年是猪年。");
            }
        }
    }
}

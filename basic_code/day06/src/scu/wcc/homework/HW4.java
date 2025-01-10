package scu.wcc.homework;

public class HW4 {
    public static void main(String[] args) {
        System.out.println(getPositive(23.3));
        System.out.println(getPositive(-325.3));
        System.out.println(getPositive(0));
    }
    public static double getPositive(double number){
        if(number < 0 ){
            return -number;
        }else{
            return number;
        }
    }
}

package scu.wcc.homework;

public class HW1 {
    public static void main(String[] args) {
        System.out.println(getMin(13.6,66.0));
    }

    public static double getMin(double num1, double num2){
        return num1>num2?num2:num1;
    }
}

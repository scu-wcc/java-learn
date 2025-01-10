package scu.wcc.homework;

public class HW2 {
    public static  void main(String[] args){
        System.out.println(getMax(12,66,25));
    }

    public static int getMax(int a, int b,int c){
        int max = a>b?a:b;
        max = max>c?max:c;
        return max;
    }
}

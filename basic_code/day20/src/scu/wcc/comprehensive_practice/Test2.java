package scu.wcc.comprehensive_practice;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(count(12));
    }
    public static int count(int number){
        if(number==1 || number==2){
            return 1;
        }
        return count(number-1)+count(number-2);
    }
}

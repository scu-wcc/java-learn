package scu.wcc.exercise;

public class Exercise2 {
    //找质数
    public static void main(String[] args) {
        int from=101;
        int to = 200;
        int count = getPrimeNumber(from,to);
        System.out.println(from+"到"+to+"之间有"+count+"个素数。");

    }
    public static int getPrimeNumber(int from,int to){
        int count = 0;
        for (int i = from; i <= to; i++) {
            int divisor = 0;
            for (int j = 1; j <=i ; j++) {
                if(i%j == 0){
                    divisor++;
                }
                if(divisor == 3){
                    break;
                }
            }
            if(divisor == 2) {
                System.out.println(i);
                count++;
            }
        }
        return count;

    }
}

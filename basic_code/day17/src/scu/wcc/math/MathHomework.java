package scu.wcc.math;

public class MathHomework {
    public static void main(String[] args) {
        System.out.println("两位数的自幂数有："+getTwo()+"个");
        System.out.println("四位数的自幂数有："+getFour()+"个");
        System.out.println("五位数的自幂数有："+getFive()+"个");


    }

    public static int getTwo(){

        int count =0;
        for (int i = 10; i < 100; i++) {
            int ge = i%10;
            int shi = i/10%10;

            double sum = Math.pow(ge,2)+Math.pow(shi,2);
            if(sum == i){
                count++;
                System.out.println(i);
            }
        }

        return count;
    }

    public static int getFour(){

        int count =0;
        for (int i = 1000; i < 10000; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/10/10%10;
            int qian = i/10/10/10%10;

            double sum = Math.pow(ge,4)+Math.pow(shi,4)+Math.pow(bai,4)+Math.pow(qian,4);
            if(sum == i){
                count++;
                System.out.println(i);
            }
        }

        return count;
    }

    public static int getFive(){

        int count =0;
        for (int i = 10000; i < 100000; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/10/10%10;
            int qian = i/10/10/10%10;
            int wan = i/10000%10;

            double sum = Math.pow(ge,5)+Math.pow(shi,5)+Math.pow(bai,5)+Math.pow(qian,5)+Math.pow(wan,5);
            if(sum == i){
                count++;
                System.out.println(i);
            }
        }

        return count;
    }
}

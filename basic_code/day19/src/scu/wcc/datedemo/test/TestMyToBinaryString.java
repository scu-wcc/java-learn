package scu.wcc.datedemo.test;

public class TestMyToBinaryString {
    public static void main(String[] args) {

        String result1  = myToBinaryString(123);
        String result2  = Integer.toBinaryString(123);
        System.out.println(result1);
        System.out.println(result2);
    }
    public static String myToBinaryString(int number){
        StringBuilder sb = new StringBuilder();
        if(number == 0){
            return "0";
        }

        while(true){

            if(number==0){
                break;
            }
            int remain = number%2;
            //insert():在指定索引位置插入
            sb.insert(0,remain);
            number= number/2;
        }
        return sb.toString();
    }
}

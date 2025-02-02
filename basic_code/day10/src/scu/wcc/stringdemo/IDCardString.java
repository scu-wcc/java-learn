package scu.wcc.stringdemo;

public class IDCardString {
    public static void main(String[] args){
        String idNumber = "452723202502029989";
        String year = idNumber.substring(6,10);
        String month = idNumber.substring(10,12);
        String day = idNumber.substring(12,14);
        System.out.println("人物信息为：");
        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");

        char genderChar = idNumber.charAt(16);
        int genderNumber = genderChar - 48;

        if(genderNumber % 2 ==0){
            System.out.println("性别：女");
        }else{
            System.out.println("性别：男");
        }

    }

}

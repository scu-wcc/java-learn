package scu.wcc.test;

public class Test1 {
    //continue
    public static void main(String[] args) {
        for (int i = 1; i <101 ; i++) {
            int ge = i%10;
            int shi =i/10%10;
            if(ge==7 || shi==7 || i%7==0){
                System.out.println("过！");
                continue;
            }
            System.out.println(i);
        }
    }
}

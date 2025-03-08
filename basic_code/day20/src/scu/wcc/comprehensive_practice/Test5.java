package scu.wcc.comprehensive_practice;

public class Test5 {
    public static void main(String[] args) {
        System.out.println(getCount(20));
    }

    public static int getCount(int stair){
        if(stair==1){
            return 1;
        }else if(stair == 2){
            return 2;
        }else if(stair==3){
            return 4;
        }
        return getCount(stair-1)+getCount(stair-2)+getCount(stair-3);
    }
}

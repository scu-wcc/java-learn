package scu.wcc.method;

public class MethodOverride {
    //方法的重载：同一个类，同名，参数不同，与返回值无关
    //参数不同：类型、数量、类型的顺序（不建议使用顺序重载）
    public static void main(String[] args) {

        isEqual((byte)9,(byte)9);
    }

    public static void isEqual(byte a, byte b){
        if(a == b){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }
    public static void isEqual(short a, short b){
        if(a == b){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }
    public static void isEqual(int a, int b){
        if(a == b){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }
    public static void isEqual(long a, long b){
        if(a == b){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }

    public static int getSum(int a, int b){
        return a+b;
    }
    public static double getSum(double a, double b){
        return a+b;
    }


}

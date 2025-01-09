package scu.wcc.method;

public class MethodDemo3 {
    public static void main(String[] args) {
        //第一个长方形面积
        double area1 = getArea(10,20);
        //第二个长方形面积
        double area2 = getArea(20,30);
        if(area1>area2){
            System.out.println("第一个长方形面积更大");
        }else{
            System.out.println("第二个长方形面积更大");
        }

    }

    //带参和返回值
    public static double getArea(double length, double width){
        return (length+width) * 2;
    }
}

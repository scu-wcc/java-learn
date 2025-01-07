package scu.wcc.homework;

public class Homework1 {
    public static void main(String[] args){
        double father = 177;
        double mother = 165;
        double son = (father+mother)*1.08/2;
        double daughter = (father*0.923+mother)/2;
        System.out.println("预估儿子的身高："+son+"cm");
        System.out.println("预估女儿的身高："+daughter+"cm");
    }
}

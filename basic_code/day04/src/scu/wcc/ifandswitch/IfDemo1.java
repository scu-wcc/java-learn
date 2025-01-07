package scu.wcc.ifandswitch;

public class IfDemo1 {
    public static void main(String[] args) {
        boolean greed = true;
        boolean yellow = false;
        boolean red = false;

        if(red){
            System.out.println("stop!!");
        }else if(yellow){
            System.out.println("slow！！");
        }else if(greed){
            System.out.println("go go go!");
        }
    }
}
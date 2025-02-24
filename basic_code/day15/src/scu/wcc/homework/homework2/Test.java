package scu.wcc.homework.homework2;

public class Test {
    public static void main(String[] args){

        Phone p = new Phone();
        usePhone(p);
        System.out.println("--------------------------");

        NewPhone np = new NewPhone();
        usePhone(np);

    }

    public static void usePhone(Phone p ){
        p.call();
        p.sentMessage();
        if(p instanceof NewPhone np){
            np.play();
        }else{
            System.out.println("旧手机无法玩游戏。");
        }
    }
}

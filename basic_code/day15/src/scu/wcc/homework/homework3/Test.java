package scu.wcc.homework.homework3;

public class Test {
    public static void main(String[] args) {

        new IPlay(){

            @Override
            public void playGame() {
                System.out.println("玩游戏");
            }
        }.playGame();

        new Fun(){
            @Override
            public void fun(){
                System.out.println("fun...");
            }
        }.fun();
    }
}

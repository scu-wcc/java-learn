package scu.wcc.homework.homework2;

public class NewPhone extends Phone implements IPlay{
    @Override
    public void play() {
        System.out.println("正在使用新手机玩游戏...");
    }
}

package scu.wcc.extendsdemo.homework.HK1;

public class Tutor extends Teacher{
    public Tutor(){}
    public Tutor(String id, String name){
        super(id,name);
    }

    @Override
    public void work() {
        System.out.println("助教正在协助讲师上课。");
    }
}

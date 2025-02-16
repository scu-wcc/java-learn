package scu.wcc.extendsdemo.homework.HK1;

public class Maintainer extends AdminStaff{
    public Maintainer(String id, String name) {
        super(id, name);
    }

    public Maintainer() {
    }

    @Override
    public void work() {
        System.out.println("维护专员正在维护系统。");
    }
}

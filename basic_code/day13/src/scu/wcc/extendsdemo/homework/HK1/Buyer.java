package scu.wcc.extendsdemo.homework.HK1;

public class Buyer extends AdminStaff{
    public Buyer(String id, String name) {
        super(id, name);
    }

    public Buyer() {
    }

    @Override
    public void work() {
        System.out.println("采购专员正在采购物质。");
    }
}

package scu.wcc.extendsdemo.homework.HK5;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, String workID, int salary, int bonus) {
        super(name, workID, salary);
        this.bonus = bonus;
    }

    public Manager() {
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println("项目经理正在检查员工工作。");
    }
}

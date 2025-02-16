package scu.wcc.extendsdemo.homework.HK5;

public class Employee {
    private String name;
    private String workID;
    private int salary;

    public Employee(String name, String workID, int salary) {
        this.name = name;
        this.workID = workID;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println("员工正在工作");
    }
}

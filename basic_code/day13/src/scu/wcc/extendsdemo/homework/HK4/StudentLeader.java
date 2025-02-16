package scu.wcc.extendsdemo.homework.HK4;

public class StudentLeader extends Student{
    private String job;

    public StudentLeader(String name, char gender, int age, String nationality, String school, String stuNumber, String job) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
    }

    public StudentLeader() {
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void meeting(){
        System.out.println("学生干部喜欢开会!");
    }
}

package scu.wcc.homework.homework3;

public class GirlFriend {
    private String name;
    private int age;
    private char gender;
    private String hobbit;

    public GirlFriend(){};
    public GirlFriend(String name,int age,char gender, String hobbit){
        this.name=name;
        this.age = age;
        this.gender = gender;
        this.hobbit = hobbit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHobbit() {
        return hobbit;
    }

    public void setHobbit(String hobbit) {
        this.hobbit = hobbit;
    }
}

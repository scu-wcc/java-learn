package scu.wcc.myannotationdemo;

//@MyAnnotation(age = 23)
public class MyAnnoTest {

    @MyAnnotation(age = 23)
    private String name;
    @MyAnnotation(age = 23)
    private int age;
    @MyAnnotation(age = 23)
    private char gender;

    //@MyAnnotation(age = 23)
    public MyAnnoTest() {
    }
    //@MyAnnotation(age = 23)
    public MyAnnoTest(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "MyAnnoTest{name = " + name + ", age = " + age + ", gender = " + gender + "}";
    }
}

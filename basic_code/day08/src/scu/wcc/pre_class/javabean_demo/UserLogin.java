package scu.wcc.pre_class.javabean_demo;

public class UserLogin {
    //标准的JavaBean
    /*
    1.类名见名知意，大驼峰命名法
    2.成员变量使用private修饰
    3.提供至少两个构造方法：空参和带全部参数
    4.为每个成员变量提供对应的set和get方法
    5.满足所需的所有行为
    */

    private String name;
    private String password;
    private String email;
    private char gender;
    private int age;

    public UserLogin() {

    }

    public UserLogin(String name, String password, String email, char gender, int age) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }

    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public void setGender(char gender){
        this.gender=gender;
    }

    public void setAge(int age){
        if(age>=19 && age<=25){
            this.age = age;
        }else{
            System.out.println("年龄错误");
        }
    }

    public void register(){
        if(name!=null && password!=null && age !=0 && email!=null){
            System.out.println("注册成功！");
        }else{
            System.out.println("注册失败");
        }
    }


}

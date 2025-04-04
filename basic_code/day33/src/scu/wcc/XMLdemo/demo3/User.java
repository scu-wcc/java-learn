package scu.wcc.XMLdemo.demo3;

public class User {
    private String id;
    private String name;
    private String password;
    private String userid;
    private String phone;
    private boolean flag;


    public User() {
    }

    public User(String id, String name, String password, String userid, String phone, boolean flag) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.userid = userid;
        this.phone = phone;
        this.flag = flag;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return flag
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * 设置
     * @param flag
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String toString() {
        return "User{id = " + id + ", name = " + name + ", password = " + password + ", userid = " + userid + ", phone = " + phone + ", flag = " + flag + "}";
    }
}

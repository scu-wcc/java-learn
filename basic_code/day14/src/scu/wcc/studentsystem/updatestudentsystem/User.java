package scu.wcc.studentsystem.updatestudentsystem;

public class User {
    private String userName;
    private String userPassword;
    private String userIDNumber;
    private String phoneNumber;

    public User(String userName, String userPassword, String userIDNumber, String phoneNumber) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userIDNumber = userIDNumber;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserIDNumber() {
        return userIDNumber;
    }

    public void setUserIDNumber(String userIDNumber) {
        this.userIDNumber = userIDNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

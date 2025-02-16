package scu.wcc.extendsdemo.homework.HK3;

public class Phone {
    private String brand;
    private int price;
    static int size =6;

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void setSize(int size) {
        Phone.size = size;
    }

    public void call(){
        System.out.println("正在打电话");
    }
    public void sendMessage(){
        System.out.println("正在发短信");
    }

    public void playGame(){
        System.out.println("正在玩游戏");
    }
}

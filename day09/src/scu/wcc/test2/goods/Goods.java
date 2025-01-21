package scu.wcc.test2.goods;

public class Goods {
    private String ID;
    private String name;
    private double price;
    private int count;

    public Goods() {
    }

    public Goods(String ID, String name, double price, int count) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

package scu.wcc.homework.homework1;

public class Rectangle extends Shape{

    private double length;
    private double weight;

    public Rectangle() {
    }

    public Rectangle(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void getArea() {
        System.out.println("长方形的面积是："+(weight*length));
    }

    @Override
    public void getCircumference() {
        System.out.println("长方形的周长是："+2*(weight+length));
    }
}

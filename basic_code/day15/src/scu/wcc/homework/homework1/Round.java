package scu.wcc.homework.homework1;

public class Round extends Shape{
    private final static double pi = 3.1415926;
    private double radius;

    public Round() {
    }

    public Round(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.printf("圆的面积是：%.3f\n", radius*radius*pi);
    }

    @Override
    public void getCircumference() {
        System.out.printf("圆的周长是：%.3f", 2*pi*radius);
    }
}

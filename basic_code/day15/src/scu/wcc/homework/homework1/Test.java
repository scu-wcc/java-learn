package scu.wcc.homework.homework1;

public class Test {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.setLength(13);
        rec.setWeight(2);
        rec.getArea();
        rec.getCircumference();

        Round round = new Round(3.6);
        round.getArea();
        round.getCircumference();
    }
}

package scu.wcc.mythread.exercise.exercise4;

public class Test {
    public static void main(String[] args) {
        RedBag r1 = new RedBag();
        RedBag r2 = new RedBag();
        RedBag r3 = new RedBag();
        RedBag r4 = new RedBag();
        RedBag r5 = new RedBag();

        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();
    }
}

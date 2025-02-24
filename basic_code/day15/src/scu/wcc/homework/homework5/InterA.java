package scu.wcc.homework.homework5;

interface InterA {
    void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }
}

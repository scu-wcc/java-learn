package scu.wcc.mydynamicproxy;

public class Test {
    public static void main(String[] args) {
        Star star = ProxyUtil.createProxy(new BigStar("鸡哥"));

        star.sing("只因你太美");
        star.dance();

    }
}

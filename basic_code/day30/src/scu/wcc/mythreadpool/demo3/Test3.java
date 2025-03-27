package scu.wcc.mythreadpool.demo3;

public class Test3 {
    public static void main(String[] args) {

        //获取虚拟机最大可使用处理器数量
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}

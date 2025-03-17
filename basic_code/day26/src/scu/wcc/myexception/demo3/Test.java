package scu.wcc.myexception.demo3;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try{
            System.out.println(arr[10]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("索引越界异常");
        }
        System.out.println("看看我执行了吗？");
    }
}

package scu.wcc.system;

public class Test {
    public static void main(String[] args) {
        //exit(status):
        //0：正常停止；非0：异常停止
//        System.exit(1);
//        System.out.println("look me");
        long l =System.currentTimeMillis();//获取从原子时间（America:1978-01-01 00:00:00）到当前事件的毫秒数
        System.out.println(l);

        System.out.println("----------------------");
        int[] arr1 =new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr2 =new int[10];
        //源数组，源数组索引，目标数组，目标数组索引，拷贝元素个数；
        System.arraycopy(arr1,0,arr2,0,5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}

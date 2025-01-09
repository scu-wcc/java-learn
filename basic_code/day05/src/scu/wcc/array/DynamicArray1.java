package scu.wcc.array;

public class DynamicArray1 {
    public static void main(String[] args) {
        //动态定义数组：只规定长度，不规定内容
        //动态数组的内容由虚拟机默认给出。
        String arr[] = new String[5];
        arr[1] = "张三";
        System.out.println(arr[0]); //null
        System.out.println(arr[1]); //张三

        //索引越界：报错
        // System.out.println(arr[6]);

    }
}

package scu.wcc.array;

public class StaticArray1 {
    public static void main(String[] args) {
        //定义数组
        int[] arr1 = new int[] {1,2,3,4,5,6}; //Java-style
        double arr2[] = new double[] {12.2,22.6,11.20}; //C-style
        System.out.println(arr2);//[D@776ec8df：数组的类别以及地址值
        //简化
        String[] arr3 ={"张三","王五","李四","老六"};
        System.out.println(arr3); //[Ljava.lang.String;@4eec7777

        //数据存储/覆盖
        System.out.println(arr3[1]);
        arr3[1] = "未注册";
        System.out.println(arr3[1]);


    }
}

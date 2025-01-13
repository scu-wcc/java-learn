package scu.wcc.exercise;

public class TwoDimensionDynamicDemo {
    //动态定义
    public static void main(String[] args) {
        //二维数组中存在：2个一维数组；每个一维数组中存储3个元素
        int[][] arr1 = new int[2][3];

        for (int i = 0; i < arr1.length; i++) {
            //获取一维数组:arr3[i]
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        //创建的二维数组中，一维数组是null，需要我们自己创建并添加
        int[][] arr2 =new int[2][];
        //好处是可以不固定一维数组的大小
        int[] arr21={1,2,3};
        int[] arr22 = {4,5,6};
        arr2[0] = arr21;
        arr2[1] =arr22;

        //手动创建一维数组，覆盖系统自动生成的一维数组
        int[][] arr3 =new int[2][2];
        int[] arr31={1,2,3};
        int[] arr32 = {4,5,6};
        arr3[0] = arr31;
        arr3[1] =arr32;
    }
}

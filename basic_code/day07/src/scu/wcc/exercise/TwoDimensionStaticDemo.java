package scu.wcc.exercise;

public class TwoDimensionStaticDemo {
    public static void main(String[] args) {
        //二维数组的定义与一维数组类似
        int[][] arr1 = new int[][]{{1,2,3,4},{5,6,7}};
        //简化格式
        int[][] arr2 = {{1,2,3,4},{5,6,7},{8,9,10}} ;
        int[][] arr3 = {
                {1,2,3,4},
                {5,6,7},
                {8,9,10}
        };

        //输出二维数组
        for (int i = 0; i < arr3.length; i++) {
            //获取一维数组:arr3[i]
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}

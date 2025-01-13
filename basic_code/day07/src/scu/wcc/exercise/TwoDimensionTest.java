package scu.wcc.exercise;

public class TwoDimensionTest {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        int[] sum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i] += arr[i][j];
            }
        }
        int yearSum = 0;
        for (int i = 0; i < sum.length; i++) {
            yearSum += sum[i];
            System.out.println("第" + (i + 1) + "季度的总营业额是：" + sum[i]);
        }
        System.out.println("全年总营业额：" + yearSum);
    }
}

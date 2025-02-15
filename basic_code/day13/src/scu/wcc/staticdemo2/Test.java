package scu.wcc.staticdemo2;

public class Test {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.2,3.6,4.9,5.8,9.8};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.printf("%.3f",avg);
    }
}

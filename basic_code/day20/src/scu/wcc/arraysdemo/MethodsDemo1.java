package scu.wcc.arraysdemo;

import java.util.Arrays;
import java.util.Comparator;

public class MethodsDemo1 {
    public static void main(String[] args) {
        int[] arr = {5,6,3,7,9,2,1,5,3,6,0};
        //1. 把数组拼接成一个字符串
        System.out.println("----------------------toString--------------------");
        System.out.println(Arrays.toString(arr));

        //2.使用二分查找查找元素
        System.out.println("----------------------binarySearch--------------------");
        int[] arr2={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(arr2,2));//1
        System.out.println(Arrays.binarySearch(arr2,6));//5
        System.out.println(Arrays.binarySearch(arr2,20));//-10:数组中没有该数字，其位置应该是index(9),输出-index-1:避免元素0与索引0相同

        //3.拷贝数组
        System.out.println("----------------------copyOf--------------------");
        int [] arr3 = Arrays.copyOf(arr2,6);
        System.out.println(Arrays.toString(arr3));//[1, 2, 3, 4, 5, 6]

        //4.拷贝指定内容段的数组
        System.out.println("----------------------copyOfRange--------------------");
        int[] arr4 = Arrays.copyOfRange(arr2,3,8);
        System.out.println(Arrays.toString(arr4));//[4, 5, 6, 7, 8]

        //5.用指定元素填充数组
        System.out.println("----------------------fill--------------------");
        int[] arr5 = new int[6];
        Arrays.fill(arr5,100);
        System.out.println(Arrays.toString(arr5));//[100, 100, 100, 100, 100, 100]

        //6.排序数组
        System.out.println("----------------------sort(默认排序)--------------------");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //7.sort的重载方法:指定排序规则
        //sort使用二分查找+插值排序
        //o1：无序序列中遍历得到的数据
        //o2：有序序列中遍历得到的数据
        //返回值：>=0:o1放在后面；<0：o1放在前面
        System.out.println("----------------------sort重载--------------------");
        Integer[] arr6 = {4,5,82,2,71,2,14,2};
        Arrays.sort(arr6, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr6));
    }
}

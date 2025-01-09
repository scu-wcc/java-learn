package scu.wcc.array;

public class ArrayMemory {
    //堆栈内存
    public static void main(String[] args) {
        //在Java中，栈存储的是方法以及方法的变量，例如main方法和其变量
        //使用new关键字生成的，例如对象和数组，会在堆上开辟一块新空间
        /*
          int[] arr = new int[5];
          arr存储在栈上，记录的是该数组在堆中的地址值
          该数组的数据都存储在堆上，通过地址+索引的方式访问（arr[i]）
         */

        //在堆上开辟一块空间，记录数据
        int[] arr1 = new int[]{11,22};
        //将数组的堆地址赋值给arr2
        int[] arr2 =arr1;
        System.out.println(arr1[0]); //11
        System.out.println(arr2[0]); //11

        //arr2操作的是同一块堆内存空间
        arr2[0] =30;
        System.out.println(arr1[0]); //30
        System.out.println(arr2[0]); //30
    }
}

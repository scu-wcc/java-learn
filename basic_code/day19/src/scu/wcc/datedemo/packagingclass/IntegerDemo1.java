package scu.wcc.datedemo.packagingclass;


public class IntegerDemo1 {
    public static void main(String[] args) {
        //JDK5之前需要使用构造方法或者静态方法
//        Integer i1 = new Integer(5);
//        Integer i2 = new Integer("9");
//        System.out.println(i1); //5
//        System.out.println(i2); //9
//        Integer i3 = Integer.valueOf(6);
//        Integer i4 = Integer.valueOf(10);
//        System.out.println(i3); //6
//        System.out.println(i4); //10

        //JDK5之前Integer的计算需要先转换成int，再将结果转换成Integer
//        Integer i5=Integer.valueOf(1);
//        Integer i6=Integer.valueOf(2);
//        int result = i5.intValue()+i6.intValue();
//        Integer i7 = Integer.valueOf(result);
//        System.out.println(i7);//3
        //JDK5之后不需要转换，JVM底层自动转换
        Integer i8 = 8;
        int i = i8;

        System.out.println(i8+", "+i);

        Integer i9 = 9;
        System.out.println(i8+i9);


    }
}

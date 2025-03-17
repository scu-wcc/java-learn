package scu.wcc.myexception.throwexception;

public class Test {
    public static void main(String[] args) {
        int[] arr = {};
        int max = 0;

        try {
            max=getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界异常");
        }


        System.out.println(max);
    }



    public static int getMax(int[] arr){

        if(arr==null){
            throw new NullPointerException();
        }

        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException();
        }

        int max = arr[0];
        for (int i : arr) {
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}

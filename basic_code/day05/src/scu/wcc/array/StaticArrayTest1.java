package scu.wcc.array;

public class StaticArrayTest1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int sum = 0;
        int len1=arr1.length;
        for (int i = 0; i < len1; i++) {
            sum+=arr1[i];
        }
        /*
        在idea中可以这样写：
        for(int i:arr1)
            sum+=i;
         */
        System.out.println(sum);

        int[] arr2={1,2,3,4,5,6,7,8,9,10};
        int count=0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]%3==0){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("-------------------------------------------");

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]%2==0){
                arr2[i]=arr2[i]/2;
            }else{
                arr2[i]*=2;
            }
            System.out.println(arr2[i]);
        }
    }
}

package scu.wcc.argsdemo;

public class ArgsDemo1 {
    public static void main(String[] args) {

        int sum=0;
        System.out.println(getSum(sum,2,3,4,5,5,7));



    }

    //可变参数必须写在形参的最后，这也导致了形参中只能有一个可变参数
    //public static int getSum(int...args1, int...args2){}
    public static int getSum(int sum, int...args){

        for(int i:args){
            sum+=i;

        }
        return sum;
    }

}

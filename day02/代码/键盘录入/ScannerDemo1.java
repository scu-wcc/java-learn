//使用前先导包
import java.util.Scanner;

public class ScannerDemo1{
    public static void main(String[] args){
        //创建对象
        Scanner sc = new Scanner(System.in);

        //使用对象
	System.out.print("请输入数字：");
        int number = sc.nextInt();
	System.out.println(number);
    }
}
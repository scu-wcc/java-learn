import java.util.Scanner;

public class ScannerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数字：");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数字：");
		int num2 = sc.nextInt();
		System.out.println("数字的总和是："+(num1 + num2));
	}
}
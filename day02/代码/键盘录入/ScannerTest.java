import java.util.Scanner;

public class ScannerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ�����֣�");
		int num1 = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int num2 = sc.nextInt();
		System.out.println("���ֵ��ܺ��ǣ�"+(num1 + num2));
	}
}
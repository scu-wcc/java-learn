public class DataType{
    public static void main(String[] args){

        //long和float类型的数据后面需要加L/l、F/f
        float f = 0.245f;
        long l = 12345678998L;
        System.out.println(f);
        System.out.println(l);
	
		//java中char类型占两个字节，因为Java使用Unicode编码来表示字符，而Unicode编码需要至少2个字节来表示一个字符。
		//所以java中可以使用char类型来表示汉字
		char name = '王';
		System.out.println(name);
    }
}
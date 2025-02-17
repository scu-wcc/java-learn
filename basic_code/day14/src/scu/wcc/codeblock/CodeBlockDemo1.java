package scu.wcc.codeblock;

public class CodeBlockDemo1 {
    //局部代码块：写在方法内，用于提前结束变量的生命周期。
    public static void main(String[] args) {
        {
            int a=10;
        }//a的生命周期结束
        //int a = 10;
        //System.out.println(a);
    }
}

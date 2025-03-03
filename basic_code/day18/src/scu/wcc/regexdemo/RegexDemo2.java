package scu.wcc.regexdemo;

public class RegexDemo2 {
    public static void main(String[] args) {
        String regex1 = "\\w{4,16}";

        //[abcd] : a b c d 出现一个即可
        String regex2 = "[1-9]\\d{16}(\\d|X|x)";
        String regex3 = "[1-9]\\d{16}[\\dXx]";

        System.out.println("51364420080915123X".matches(regex2));//true
        System.out.println("51364420080915123X".matches(regex3));//true

        String regex4 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9&&^2]|10|11|12|2[0-9])(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
    }
}

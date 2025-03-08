package scu.wcc.comprehensive_practice;

public class Test4 {
    public static void main(String[] args) {
        int one = 20;
        int two = 0;

        int sum = 0;
        for (int i = 1; i < 10; i++) {
            int m = one - i * 2;
            int n = two + i;
            sum = sum + getCombinations(m + n, n);
        }
        //全1或2的爬法
        sum+=2;
        System.out.println(sum);
    }

    public static int getCombinations(int m, int n) {
        // 避免重复计算
        if (n > m - n) {
            n = m - n;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * (m - i + 1) / i;
        }
        return result;
    }
}

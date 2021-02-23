package Code.Exercise.DynamicProgramming;

public class Fibonacci {
    public  int solution_Fibonacci(int n) {
        /**
         * 斐波那契数列的动态规划求解
         * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
         * 也就是：F(0) = 0，F(1) = 1 F(n) = F(n - 1) + F(n - 2)，其中 n > 1
         */
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int result[] = new int[n + 1];
            result[0] = 0;
            result[1] = 1;
            for (int i = 2; i <= n; i++) {
                result[i] = result[i - 1] + result[i - 2];
            }
            return result[n];
        }

    }
}

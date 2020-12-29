package Code.algHomework;

import org.junit.Test;

public class knapsackDP {
    /**
     * @author 张菲凡
     * @Class 18软件设计二班
     * @StuID 1815925161
     * @param W 需要传入的物品的质量，一维数组
     * @param V 需要传入物品的价值，一维数组与质量相对应
     * @param M 背包能容纳的最大质量
     * @param n 可选物品一共有多少个
     */
    public void knapsackDyProg(int W[], int V[], int M, int n) {
        int B[][] = new int[n + 1][M + 1];
        //创建二维数组，用于存储数据

        for (int i=0; i<=n; i++)
            for (int j=0; j<=M; j++) {
                B[i][j] = 0;
            }
        //赋个默认初始值
        /**
         * 从这里，开始计算背包问题，首先先从第1个背包（i=1）的时候开始
         * 依次递推：选择第一个背包时的最优解，选择第一个背包加第二个背包时的最后解
         * 选择第1个背包到第n个背包的时候的最优解。最终我们只需要输出B[n,m]即可得到最大值
         * 至于最优解的问题，将在后半部分进行讨论，至于算法复杂度因为老师让十一点前提交作业
         * 因此没有时间来进行更深层次的优化，根据估算，算法时间复杂度应该为n²(因为有两层for循环)
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= M; j++) {
                B[i][j] = B[i - 1][j];
                //默认不选择当前背包，然后根据下一步判断是否可以把当前背包选进去

                if ((j >= W[i-1]) && (B[i][j] < B[i - 1][j - W[i - 1]] + V[i - 1])) {
                    /**
                     * j >= W[i-1]意思是现在背包还能够装得下当前的物品 j为当前剩余的背包容量
                     * 并且呢如果我们选择了当前的背包i，当前的最大价值应该小于 考虑(i-1)个背包，加上当前背包具有的价值
                     * 也就是说，我们若添加上当前背包，我们理应获得更大的“最优解”
                     *B[i][j] 当前的最优解
                     * B[i - 1][j - W[i - 1]] 上一个背包的最优解
                     *V[i - 1] 当前物品的价值
                     *
                     *  **/

                    B[i][j] = B[i - 1][j - W[i - 1]] + V[i - 1];
                    //我们得到了新的最优解
                }

                System.out.print(B[i][j] + " ");
                //输出二维数组，
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        System.out.println("Max Value:\t" + B[n][M]);

        System.out.println("Selected Packs: ");

        while (n != 0) {
            if (B[n][M] != B[n - 1][M]) {
                //因为如果我们选中了背包，我们就会改变和上一个背包相邻的值
                //因此可以采用判断的方式，来检查我们到底选中了哪些背包
                System.out.println("\tPackage " + n + " with W = " + W[n - 1] + " and Value = " + V[n - 1]);

                M = M - W[n-1];
            }

            n--;
        }
    }
    @Test
    public void run() {
        //int W[] = new int[]{3, 4, 5, 9, 4};
        int W[] = new int[]{12, 2, 1, 1, 4};
        //int V[] = new int[]{3, 4, 4, 10, 4};
        //使用两组数据进行测试，以确保算法的正确性
        int V[] = new int[]{4, 2, 1, 2, 10};
        int M = 15;
        int n = V.length;

        /*
         * 运行算法
         */
        knapsackDyProg(W, V, M, n);
    }


}

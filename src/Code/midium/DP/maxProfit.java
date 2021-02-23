package Code.midium.DP;

import org.junit.Test;

public class maxProfit {
    public int solution_DP(int[] prices){
        int n = prices.length;
        if(n==0||n==1){
            return 0;
        }
        if(n==2)
        {
            return prices[1]-prices[0]>0?prices[1]-prices[0]:0;
        }
        int[][]table=new int[n][n];
        int result=0;
        int opt;
        //从买入开始
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 1; j <n-1 ; j++) {
                if(j>=i){
                     opt=Math.max(table[i][j-1],prices[j]-prices[i]);
                    table[i][j]=opt;
                    if(opt>result){
                        result=opt;
                    }
                }
                //买入为i 卖出为j
            }
            //处理当前行最后一个元素
            opt=Math.max(table[i][n-2],prices[n-1]-prices[i]);
            table[i][n-1]=opt;
//            System.out.println(opt);
            if(opt>result){
                result=opt;
            }

        }
        System.out.println(result);
//        System.out.println(table.toString());

        return 0;
    }

    public int solution_DP_OPT(int[] prices) {
        /**
         * 此方法为一维数组的暴力算法/假动态规划
         */
        int n = prices.length;
        if(n==0||n==1){
            return 0;
        }
        if(n==2)
        {
            return prices[1]-prices[0]>0?prices[1]-prices[0]:0;
        }
        int[]table=new int[n];
        int result=0;
        int opt;
        //从买入开始
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 1; j <n-1 ; j++) {
                if(j>=i){
                    opt=Math.max(table[j-1],prices[j]-prices[i]);
                    table[j]=opt;
                    if(opt>result){
                        result=opt;
                    }
                }
                //买入为i 卖出为j
            }
            //处理当前行最后一个元素
            opt=Math.max(table[n-2],prices[n-1]-prices[i]);
            table[n-1]=opt;
            if(opt>result){
                result=opt;
            }

        }
        System.out.println(result);

        return result;
    }

    public int solution_OPTagain(int[] prices){
        /**
         * 只有n的时间复杂度
         * 当前天卖，然后找出之前买入的最低点即可
         */

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    @Test
    public void run(){
//        int[] prices = new int[]{1,2,4};
        int[] prices = new int[]{7,1,5,3,6,4};
        int i = solution_DP_OPT(prices);
//        System.out.println(i);

    }
}

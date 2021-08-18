package Code.Offer.Easy;

public class maxSubArray {
    public int solution_DP(int[] nums) {
        /**
         * 动态规划算法，有点没看懂
         */
        int[] dp = new int[nums.length];
        //dp[i]表示以i结尾的子数组的最大结果
        //如果dp[i-1]
        //如果dp[i-1]<0 那么就是对此做负贡献

        return 1;
    }

    /**
     * *
     *  当叠加的和小于0时，就从下一个数重新开始，
     *  同时更新最大和的值(最大值可能为其中某个值)，
     *  当叠加和大于0时，将下一个数值加入和中，
     *  同时更新最大和的值，依此继续。
     */
    public int solution_greedy(int[] nums){
        int res = Integer.MIN_VALUE;
        int curSum = 0;
        for (int num : nums) {
            curSum=Math.max(curSum+num,num);
            res = Math.max(curSum,res);
        }
        return res;

    }
}

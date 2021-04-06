package Code.easy.DP;

public class maxProfit {
    public int maxProfit_greedy(int[] arr) {
        if (arr == null || arr.length <= 1) return 0;

        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {  // 卖出有利可图
                ans += (arr[i] - arr[i-1]);
            }
        }

        return ans;
    }


}

package Code.LeetCode.easy.Array;

public class searchInsert {
    /**
     * easy
     * #35
     * array
     * @param nums
     * @param target
     * @return
     */
    static int solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){return i;}

        }
        return nums.length;


    }
}

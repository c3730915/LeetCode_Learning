package Code.LeetCode.easy.Array;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class two_sum {
    /**
     * easy
     * #1
     * Hash Map and array
     */

    @Test
    public void run(){
        int[] ints = twoSum_enum(new int[]{2, 7, 11, 15}, 9);
//        System.out.println(ints);
        System.out.println("enmu"+Arrays.toString(ints));

//        int[] ints2 = twoSum_Hash(new int[]{7, 2, 11, 15}, 9);
//        System.out.println("hash"+Arrays.toString(ints2));
    }

    public int[] twoSum_enum(int[] nums,int target){
        /**
         * 枚举算法，把每一种可能都列出来，算法复杂度为O(n^2)
         */
        int len = nums.length;
        for (int i = 0; i < len-1; i++) {
            for(int j = i+1;j<len;j++){
                if (nums[i]+nums[j] ==target){
                    return new int[]{i,j};
                }
            }
            
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public int[] twoSum_TwoStepHashTable(int[] nums, int target) {
        /**
         * A simple implementation uses two iterations. In the first iteration, we add each element's value and its index to the table. Then,
         * in the second iteration we check if each element's complement
         * (target - nums[i]target−nums[i]) exists in the table. Beware that the complement must not be nums[i]nums[i] itself!
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum_OneSetpHash(int[] nums,int target){
        /**
         * O(n)为算法复杂度
         * It turns out we can do it in one-pass. While we iterate and inserting elements into the table,
         * we also look back to check if current element's complement already exists in the table.
         * If it exists, we have found a solution and return immediately.
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");



    }


}

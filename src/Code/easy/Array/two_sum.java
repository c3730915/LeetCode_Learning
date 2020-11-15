package Code.easy.Array;

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

        int[] ints2 = twoSum_Hash(new int[]{7, 2, 11, 15}, 9);
        System.out.println("hash"+Arrays.toString(ints2));
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

    public int[] twoSum_Hash(int[] nums,int target){
        /**
         * O(n)为算法复杂度
         */
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>(len);
        map.put(nums[0],0);
        for (int i = 1; i <len ; i++) {
            int another = target-nums[i];
            if (map.containsKey(another))
            {
                return new int[] {i,map.get(another)};
            }
            map.put(nums[i],i);

        }
        throw new IllegalArgumentException();



    }


}

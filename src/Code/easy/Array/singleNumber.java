package Code.easy.Array;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class singleNumber {
    public int solution(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }


        }

        return (int) (set.toArray())[0];
    }
    @Test
    public void test(){
        int[] nums = new int[]{4,1,2,1,2};
       solution(nums);
    }
}

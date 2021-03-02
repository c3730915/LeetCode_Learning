package Code.Offer.Easy;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class findRepeatNumber {
    public int sollution(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(!set.contains(num))
            {
                set.add(num);
            }else {
                return num;
            }
        }
        return 0;

    }
    @Test
    public void test(){
        int[] nums =new int[]{2, 3, 1, 0, 2, 5, 3};
        int result = sollution(nums);
        System.out.println(result);

    }
}

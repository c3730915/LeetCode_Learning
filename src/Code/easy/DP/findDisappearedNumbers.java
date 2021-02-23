package Code.easy.DP;

import org.junit.Test;

import java.util.*;

public class findDisappearedNumbers {
    public List<Integer> solution_orgin(int[] nums)
    {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <=nums.length ; i++) {
            if(!set.contains(i)){
                result.add(i);
            }
        }

        return result;
    }

    @Test
    public void test(){
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> list = solution_orgin(nums);
        System.out.println(list.toString());
    }
}

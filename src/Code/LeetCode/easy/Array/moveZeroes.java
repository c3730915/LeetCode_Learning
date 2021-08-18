package Code.LeetCode.easy.Array;

import org.junit.Test;

import java.util.*;

public class moveZeroes {
    @Test
    public void solution()
    {
        int[] nums = new int[]{0,1,0,3,12};
        int[] result = new int[nums.length];
        int index=0; //指向结果数组
        for (int num:nums
             ) {
            if (num!=0)
            {
                result[index]=num;
                index++;
            }

        }
        for (int i = 0; i <nums.length ; i++) {

            nums[i]=result[i];
        }
        System.out.println(Arrays.toString(nums));


    }
}

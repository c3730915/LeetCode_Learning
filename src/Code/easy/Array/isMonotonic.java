package Code.easy.Array;

import org.junit.Test;

public class isMonotonic {
    public boolean solution(int[] nums){
        if (nums.length == 1) {
            return true;
        }
        //首先先找到和第一位不同的数
        int ptr=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=nums[0]){
                if (i == nums.length) {
                    return true;
                }else {
                    ptr=i;
                    break;
                    //改变prt的值
                }
            }
        }
        if(nums[ptr]>nums[0])
        {
            //判断是否为递增数列
            for (int i = ptr+1; i < nums.length; i++) {
                if(nums[i]<nums[i-1])
                {
                    return false;
                    
                }
                
                
            }
            return true;
        }else {
            //判断是否为递减数列
            for (int i = ptr+1; i < nums.length; i++) {
                if(nums[i]>nums[i-1])
                {
                    return false;

                }


            }
            return true;
        }
    }
    @Test
     public void test(){
        int[]nums = new int[]{1,1,1,1,1};
        boolean result = solution(nums);
        System.out.println(result);
        

    }
}

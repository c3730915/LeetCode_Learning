package Code.LeetCode.midium.Array;

import org.junit.Test;

import java.util.Stack;

public class maxArea {
    public int solution_TwoPtr(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
//        int ptrSlow=0;
//        int prtFast=1;
        Stack<Integer> result = new Stack<>();
        int max = 0;
        for (int ptrSlow = 0; ptrSlow < nums.length; ptrSlow++) {
            for (int ptrFast = ptrSlow+1; ptrFast < nums.length; ptrFast++) {
//                result.add(Math.abs(ptrFast-ptrSlow)*Math.min(ptrFast,ptrSlow)) ;
                int distance = Math.abs(ptrFast - ptrSlow);
                int height = Math.min(nums[ptrFast],nums[ptrSlow]);
                int currentResult = height*distance;
//                System.out.println(currentResult);
                if(currentResult>max){
                    max=currentResult;
                }


            }

        }
//        System.out.println(result.toString());
        return max;


    }
    @Test
    public void run(){
        int[] nums = new int[]{1,2,1};
//        System.out.println(Math.abs(-10));
        int max = solution_TwoPtr(nums);
        System.out.println(max);


    }
}

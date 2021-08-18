package Code.LeetCode.hard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maxSlidingWindow {
    public int[] solution_outOfTime(int[] nums, int k){
        int loopSize = nums.length-k+1;
        List<Integer>resultList=new ArrayList<>(loopSize);
        Integer currentMax;
        Integer preMax;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);

        }
        List<Integer>currentList ;
        for (int i = 0; i < loopSize; i++) {
            if (i!=0)
            {

            }
             currentList = list.subList(i, i + k);
             currentMax = Collections.max(currentList);
             resultList.add(currentMax);
//             if(i==0){
//                 preMax=currentMax;
//             }
//            System.out.println(currentMax);

        }
        int[]resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i]=resultList.get(i);
        }
        return resultArray;
    }
    @Test
    public void test(){
        int[] array = new int[]{1,3,-1,-3,5,3,6,7};
        solution_outOfTime(array,3);
    }
}

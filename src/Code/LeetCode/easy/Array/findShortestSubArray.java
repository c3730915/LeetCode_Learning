package Code.LeetCode.easy.Array;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class findShortestSubArray {
    /**
     * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
     *
     * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
     */
    public int solutionHashMap(int[] nums){
        /**
         * 这个方法有个bug，因为要找最短的连续子数组....
         */
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int num : nums) {
            if(!map.containsKey(num))
            {
                map.put(num,1);
            }else {
                map.put(num,map.get(num)+1);
            }

        }
        int degree = -1;
        int mostFreqNum =-1;
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            if (value > degree) {
                degree=value;
            }
        }
        //已经得到degree 若出现最大的数为x 那么子数组一定是x出现的最开始位置和最末尾位置
        for (Integer key : map.keySet()) {
//            System.out.println(1);
            if (map.get(key).equals(degree)) {
                mostFreqNum = key;
                break;
            }
        }
        //找第一次出现mostFeq 和最后一次出现的时候
        int firstAppear=0;
        int lastAppear=-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[firstAppear] == mostFreqNum) {
                firstAppear=i;
                break;
            }else {
                firstAppear++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[nums.length - 1 - i] == mostFreqNum) {
                lastAppear=nums.length-1-i;
               break;
            }else {
                lastAppear++;
            }

        }
        return (lastAppear-firstAppear+1);
    }
    public int solutionLeetcode(int[]nums)
    {
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            } else {
                map.put(nums[i], new int[]{1, i, i});
            }
        }
        int maxNum = 0, minLen = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] arr = entry.getValue();
            if (maxNum < arr[0]) {
                maxNum = arr[0];
                minLen = arr[2] - arr[1] + 1;
            } else if (maxNum == arr[0]) {
                if (minLen > arr[2] - arr[1] + 1) {
                    minLen = arr[2] - arr[1] + 1;
                }
            }
        }
        return minLen;
    }

    @Test
    public void run(){
        int[] nums = new int[]{1,2,2,3,1};
        int result = solutionHashMap(nums);
        System.out.println(result);

    }
}

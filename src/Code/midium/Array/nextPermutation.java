package Code.midium.Array;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class nextPermutation {
    public boolean ifMax(int[] nums,int left,int right,int valueIndex){
        /**
         * @nums 传入数组
         * @left 左边界
         * @right 右边界
         * @valueIndex 判断值在数组中的下标
         * @return 返回目标值是否在范围区间内最大
         */
        for (int i = left; i <= right&&i<nums.length; i++) {
            if(nums[i]>nums[valueIndex]){
                return false;
            }

        }
        return true;

    }
    public void solution_bug(int[] nums){
         // @bug 自己写的方法失败了，采用题解的方法
        if(nums.length==1){
            return;
        }

        boolean flag =false;
        //默认不需要转化为较小的字典树
        for (int i = 0; i < nums.length; i++) {
            if (!ifMax(nums, i, nums.length - 1, i))
            {
                flag=true; //需要转换成较小的字典数
                break;
            }
        }
        //一旦有一个不满足 就需要转换
        if(!flag){
            //只需要把数组颠倒一下就行了
            Stack<Integer>stack = new Stack<>();
            for (int num : nums) {
                stack.push(num);
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i]=stack.pop();
            }
            System.out.println(Arrays.toString(nums));
        }else {
            //从末尾开始找，找到第一个比它小的数,不一定能找到，因此需要循环找
            boolean ifFindLarger = false;
            int largerIndex=0;
            int targetIndex = nums.length-1; //从后往前找，找到第一个前面有比它更大的数
            int targetNum = nums[targetIndex]; //最后一位数
            while (!ifFindLarger)
            {
                for (int i = 0; i < nums.length; i++) {
                    if(nums[nums.length-1-i]<targetNum){
                        largerIndex=nums.length-1-i;
                        ifFindLarger=true;
                        break;
                    }
                }
                if(!ifFindLarger)
                {
                    targetIndex--;
                    targetNum=nums[targetIndex];
                }
            }
         //需要把targetNum 和largerIndex的数换一下
//            nums[targetIndex] &nums[largerIndex]
            int tmp = nums[largerIndex];
            nums[largerIndex] = nums[targetIndex];
            nums[targetIndex]=tmp;
            //@bug 注意还需要保证交换位置以后的数组要从小到大排列!因为要求刚刚好比原来的大，因此要最小！
            //需要排序的是largerIndex+1 到nums.length-1
            int subArraySize=largerIndex-targetIndex;
            int[] subSort = new int[subArraySize];
            int j =0; //prt to subSort
            for (int i = largerIndex+1; i <=nums.length-1 ; i++) {
                subSort[j]=nums[i];
                j++;

            }
            j=0;
            Arrays.sort(subSort);
            for (int i = largerIndex+1; i <=nums.length-1 ; i++) {
                nums[i]=subSort[j];
                j++;

            }

            System.out.println(Arrays.toString(nums));
        }


    }
    public void solution_explanation(){
        /**
         * 思路及解法
         * 注意到下一个排列总是比当前排列要大，除非该排列已经是最大的排列。我们希望找到一种方法，能够找到一个大于当前序列的新序列，且变大的幅度尽可能小。具体地：
         * 我们需要将一个左边的「较小数」与一个右边的「较大数」交换，以能够让当前排列变大，从而得到下一个排列。
         * 同时我们要让这个「较小数」尽量靠右，而「较大数」尽可能小。当交换完成后，「较大数」右边的数需要按照升序重新排列。这样可以在保证新排列大于原来排列的情况下，使变大的幅度尽可能小。
         * 以排列 [4,5,2,6,3,1][4,5,2,6,3,1] 为例：
         * 我们能找到的符合条件的一对「较小数」与「较大数」的组合为 22 与 33，满足「较小数」尽量靠右，而「较大数」尽可能小。
         * 当我们完成交换后排列变为 [4,5,3,6,2,1][4,5,3,6,2,1]，此时我们可以重排「较小数」右边的序列，序列变为 [4,5,3,1,2,6][4,5,3,1,2,6]。
         * 具体地，我们这样描述该算法，对于长度为 nn 的排列 aa：
         * 首先从后向前查找第一个顺序对 (i,i+1)(i,i+1)，满足 a[i] < a[i+1]a[i]<a[i+1]。这样「较小数」即为 a[i]a[i]。此时 [i+1,n)[i+1,n) 必然是下降序列。
         * 如果找到了顺序对，那么在区间 [i+1,n)[i+1,n) 中从后向前查找第一个元素 jj 满足 a[i] < a[j]a[i]<a[j]。这样「较大数」即为 a[j]a[j]。
         * 交换 a[i]a[i] 与 a[j]a[j]，此时可以证明区间 [i+1,n)[i+1,n) 必为降序。我们可以直接使用双指针反转区间 [i+1,n)[i+1,n) 使其变为升序，而无需对该区间进行排序。
         */

    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }



    @Test
    public void run(){
        int[] nums = new int[]{2,3,1};
        solution_bug(nums);

    }
}

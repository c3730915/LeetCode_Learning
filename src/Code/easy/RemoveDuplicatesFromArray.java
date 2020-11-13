package Code.easy;

import org.junit.Test;

import java.util.*;

public class RemoveDuplicatesFromArray {
    public int solution_1(int[] nums){
        /**
         * 传统方法，运行时间段 算法需要时间理解
         */
        if (nums.length ==0 || nums.length==1)
        {
            return nums.length;
        }
        int p=0,q=1;
        while (q<nums.length){
            if (nums[p]==nums[q])
            {
                q++;
            }
            else {
                nums[p+1]=nums[q];
                p++;
                q++;
            }
        }

        return p+1;

    }
    public int solution_2(int[] nums){
        /**
         * 通过排序哈希表的方式，快速去除重复元素
         */
        SortedSet<Integer> hs = new TreeSet<Integer>();
        //Collections.reverseOrder() to reverseOrder

        for (int num:nums){
            hs.add(num);
        }
        Iterator<Integer> iterator = hs.iterator();
        for (int i = 0; iterator.hasNext(); i++) {
            nums[i]=iterator.next();
            System.out.println(iterator.next());
//            System.out.println(nums[i]);


        }
        return hs.size();
    }
}

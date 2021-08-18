package Code.LeetCode.easy.LinkedList;

import java.util.Arrays;

public class merge {
    /**
     * #88
     * easy
     * LinkedList,array
     */
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            System.arraycopy(nums2, 0, nums1, m, n);
            Arrays.sort(nums1);
        }
    }

}

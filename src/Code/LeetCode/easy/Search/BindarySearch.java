package Code.LeetCode.easy.Search;

import org.junit.Test;

public class BindarySearch {
    @Test
    public void test1(){

        int[] nums = new int[] {1,2,3,4,5,6,7};
        int search = search( nums, 4 );
        System.out.println(search);
        return;

    }
    public int search(int[] nums, int target){
        return this.search_rec( nums,0,nums.length-1,target);
    }

    /**
     * 二分法递归
     * @param nums
     * @param left
     * @param right
     * @param target
     * @return
     */
    public int search_rec(int[] nums,int left,int right,int target){
        if ( right >= left ){
            int mid = left + Math.abs( right - left ) /2;
            if ( nums[mid] == target )
                return mid;
            if ( nums[mid] > target )
                return search_rec( nums,left,mid-1,target );
        }
        return -1;

    }
}

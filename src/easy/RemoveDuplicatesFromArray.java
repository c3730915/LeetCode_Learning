package easy;

public class RemoveDuplicatesFromArray {
    public int solution(int[] nums){
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
}

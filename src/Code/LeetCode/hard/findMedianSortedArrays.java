package Code.LeetCode.hard;

import org.junit.Test;

import java.util.Arrays;

public class findMedianSortedArrays {
    public double solution(int[]nums1,int[]nums2)
    {
        int[] sum=new int[nums1.length+ nums2.length];
        System.arraycopy(nums1,0,sum,0,nums1.length);
        System.arraycopy(nums2,0,sum,nums1.length,nums2.length);
        Arrays.sort(sum);
        int index=sum.length/2;
        if ((sum.length)%2==0)
        {
            double avg=((double) sum[index]+(double)sum[index-1])/2;

            return avg;

        }else {
            return sum[index];
        }
    }
    @Test
    public void run(){
        double result = solution(new int[]{0,0}, new int[]{0,0});
        System.out.println(result);

    }
}

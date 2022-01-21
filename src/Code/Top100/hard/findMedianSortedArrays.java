package Code.Top100.hard;

import lombok.val;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//没写出来
public class findMedianSortedArrays {
    public double findMedianSortedArraysSolution(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List list1 = Arrays.asList( nums1 );
        list1.addAll( Arrays.asList( nums2 ) );
        Collections.sort( list1 );
        return 0;

    }
}

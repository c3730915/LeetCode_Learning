package Code.LeetCode.easy.recursion;

public class mySqrt {
    /**
     * #69
     * easy
     * recursion,
     */
    class Solution {
        public long recu(long x) {
            //第一次调用的时候
            long y=x/2;
            if(y*y<x)
            {
                //已经小了
                //do something...
                return y;
            }else {
                recu(y);
            }
            return 0;

        }
        public int mySqrt(int x) {
            if(x==0)
            {
                return 0;
            }
            if(x<=3)
            {
                return 1;
            }
            long value_temp =recu(x);
            while (value_temp*value_temp<=x)
            {
                value_temp++;
            }
            return (int)value_temp-1;

        }
    }
}

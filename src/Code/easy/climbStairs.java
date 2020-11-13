package Code.easy;

import java.util.HashMap;
import java.util.Map;

public class climbStairs {
    public static int solution(int n)
    {
       int i=0; //一阶台阶的个数
        int j=0; //二阶台阶的个数

        int sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        while (i<=n)
        {
            if((n-i)%2==0)
            {
                j=(n-i)/2;
                map.put(i,j);
//                sum++;
                //i 和J进行全排列，相当于一共有i+j的元素进行全排列

            }
            i++;
        }

        System.out.println(map.toString());

        return sum;
    }
}

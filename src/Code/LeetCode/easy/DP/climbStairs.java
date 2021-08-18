package Code.LeetCode.easy.DP;

import org.junit.Test;

import java.util.HashMap;

public class climbStairs {
    public void solution(int n){
        HashMap<Integer,Integer> reslut=new HashMap<>();
        for (int i = 0; i <=n ; i++) {
            if(i<2){
                reslut.put(i,i); //前两次等于本身
            }
            else {
                //从第三次开始
                Integer preVal = reslut.get(i-1);
                Integer preVall_pre=reslut.get(i-2);
                Integer currentVal =preVal+preVall_pre;
                reslut.put(i,currentVal);
//                System.out.println("current Val is "+currentVal);
            }
        }
        Integer finalVal = reslut.get(n);
        System.out.println(finalVal);
    }
    @Test public void run(){
        solution(4);
    }
}

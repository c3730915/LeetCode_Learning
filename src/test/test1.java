package test;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class test1 {
    /**
     * 用递归写一个算法，一个小球从100米高处掉落，落地后反弹，反弹高度为掉落高度的一半，问掉落10次之后，小球反弹的高度和总共走过的距离
     */

    @Test
    public void run(){
//        double[]result = dfs(0, 0, 100);
//        System.out.println(Arrays.toString(result));
        System.out.println(maxDivisor(12, 30));
    }
    public double[] dfs(int currentBounce,double totalLength,double currentHeight){
        if(currentBounce ==10){
            return new double[]{currentHeight/2,totalLength};
        }
        //先往下坠落：
        totalLength+=currentHeight;

        //然后再反弹，反弹高度为下落一半
        totalLength+=currentHeight/2;
        currentBounce++;
        return dfs(currentBounce,totalLength,currentHeight/2);
    }

    public int maxDivisor(int num1,int num2){
        int result =0;
        Set<Integer> reslut = new HashSet<>();
        Set<Integer> num1Divisor = new HashSet<>();
        Set<Integer> num2Divisor = new HashSet<>();

//        reslut.retainAll()

        for (int i = 1; i < (num1/2)+1; i++) {
            if(num1%i==0){
                num1Divisor.add(i);
            }

        }
        for (int i = 1; i < (num2/2)+1; i++) {
            if(num2%i==0){
                num2Divisor.add(i);
            }

        }
        reslut.addAll(num1Divisor);
        reslut.retainAll(num2Divisor);
        if(reslut.size()==0){
            return 0;
        }
        int maxDiv =Integer.MIN_VALUE;
        for (Integer integer : reslut) {
            if(integer>maxDiv){
                maxDiv=integer;
            }

        }
        return maxDiv;
    }
}

package test;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class test1 {
    /**
     * 用递归写一个算法，一个小球从100米高处掉落，落地后反弹，反弹高度为掉落高度的一半，问掉落10次之后，小球反弹的高度和总共走过的距离
     */

    @Test
    public void run(){
//        double[]result = dfs(0, 0, 100);
//        System.out.println(Arrays.toString(result));
    }
    @Test
    public void getIniList(){
        String str = "30630554,4353,4343";
        String[] split = str.split(",");
//        System.out.println(Arrays.toString(split));
        List<String> result = Arrays.asList(split);
        List<String> market = getMarketList.getMarket("1");
        System.out.println(result);
        System.out.println(market);


    }
    @Test
    public void getMarket(){
        String[] market = new String[]{"中东市场","非洲市场","欧洲市场","拉美市场","朝鲜市场","古巴市场","美国市场"};
        Random rand = new Random();
        int randNum = rand.nextInt(market.length-1); //生成0~数组长度-1的随机数 包括
        List<String> resultList = new ArrayList<>();
        if(randNum!=0){
            resultList.addAll(Arrays.asList(market[randNum-1],market[randNum]));
        }else {
            resultList.addAll(Arrays.asList(market[0],market[randNum+1]));

        }
        System.out.println(resultList.toString());

//        return resultList;
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

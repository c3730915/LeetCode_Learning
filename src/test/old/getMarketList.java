package test.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class getMarketList {

    /**
     * 根据用户id返回用户所在市场，这是一个数据挡板，仅供测试使用
     * @param userId
     * @return
     */
    public static List<String> getMarket(String userId){
        String[] market = new String[]{"中东市场","非洲市场","欧洲市场","拉美市场","朝鲜市场","古巴市场","美国市场"};
        Random rand = new Random();
        int randNum = rand.nextInt(market.length-1); //生成0~数组长度-1的随机数 包括
        List<String> resultList = new ArrayList<>();
        if(randNum!=0){
            resultList.addAll(Arrays.asList(market[randNum-1],market[randNum]));
        }else {
            resultList.addAll(Arrays.asList(market[0],market[randNum+1]));
        }
        return resultList;
    }
}

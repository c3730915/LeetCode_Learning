package Code.easy.Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class canPlaceFlowers {
    public boolean solution(int[] flowerbed, int n)
    {
        int size = flowerbed.length;
        if (n==0){
            return true;
        }


        if (size==1)
        {
            return flowerbed[0]==0?true:false;
            //处理size大小为1的情况
        }
        int ableToPlace = 0;
        for (int i = 0; i < size; i++) {
            if (i==0){
                if (flowerbed[0]==0&&flowerbed[1]==0){
                    //表示当前位置可以种花
                    flowerbed[0]=1;//把花种下去
                    ableToPlace++;
                }
            }
            if (i != 0 && i != size- 1) {
                //既不是第一个也不是最后一个
                if(flowerbed[i]==0&&flowerbed[i+1]==0&&flowerbed[i-1]==0){
                    //当前节点为0 并且左右都为0,那就种下去
                    flowerbed[i]=1;//把花种下去
                    ableToPlace++;
                }
            }
            if (i == size - 1) {
                //到了最后一个
                if (flowerbed[i] == 0 && flowerbed[i-1] == 0) {
                    //可以种
                    flowerbed[i]=1;//把花种下去
                    ableToPlace++;
                }
            }

        }
        System.out.println(ableToPlace);
//        System.out.println(flowerbedList);
        return ableToPlace>=n?true:false;
    }
    @Test
    public void test(){
        int[] array = new int[]{0};
        boolean result = solution(array, 1);
        System.out.println(result);
    }
}

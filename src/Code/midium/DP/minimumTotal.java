package Code.midium.DP;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class minimumTotal {
    public void solution_wrong(List<List<Integer>> triangle){
        /**
         * 此算法存在错误，应当被抛弃
         */
        int length = triangle.size();
        int preIndex =0;
        HashMap<Integer,Integer> optResult=new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (i==0){
                optResult.put(i+1,triangle.get(0).get(0));

            }else {
                List<Integer> currentLine = triangle.get(i);
//                第二行的最优结果=第一行的最优结果+当前选择
                if(currentLine.get(preIndex)<currentLine.get(preIndex+1))
                {
                    //当前下标的比下标+1的小,preIndex不用动
                    optResult.put(i+1,currentLine.get(preIndex)+optResult.get(i));
                }
                else {
                    Integer tmp1 = currentLine.get(preIndex + 1);
                    Integer tmp2 =optResult.get(i);


                    optResult.put(i+1,currentLine.get(preIndex+1)+optResult.get(i));
                    preIndex++;
                }



            }

        }
        System.out.println(optResult.get(length));

    }
    @Test
    public void run(){
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list1=Arrays.asList(-1);
        List<Integer> list2=Arrays.asList(2,3);
        List<Integer> list3=Arrays.asList(1,-1,3);
        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
//        triangle.add(list4);
        solution_wrong(triangle);

    }
}

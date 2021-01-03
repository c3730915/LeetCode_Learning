package Code.midium.DP;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class minimumTotal {
    private int sum = 0;


    List<List<Integer>> triangleList;
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
    public void solution_DFS(List<List<Integer>> triangle){
        triangleList=triangle;
        //递归遍历层数
        System.out.println(rec(0,0));


    }
    public int rec(int dept,int index)
    {
        if(dept==triangleList.size()){
            return 0;
            //递归终止条件
        }
        if (dept!=triangleList.size()){
//
          return Math.min(rec(dept+1,index),rec(dept+1,index+1))+triangleList.get(dept).get(index);

        }
        return sum;

    }


    public int solution_DP(List<List<Integer>> triangle){
        int n = triangle.size();
        int[][] f = new int[n][n];
        f[0][0] = triangle.get(0).get(0); //处理顶点数据
        for (int i = 1; i < n; ++i) { //从第二行开始遍历
            f[i][0] = f[i - 1][0] + triangle.get(i).get(0); //第i行的第一个元素独立处理
            for (int j = 1; j < i; ++j) { //从当前行的第二个元素开始处理
                f[i][j] = Math.min(f[i - 1][j - 1], f[i - 1][j]) + triangle.get(i).get(j);
                //动态规划二维表的转移方程
            }
            f[i][i] = f[i - 1][i - 1] + triangle.get(i).get(i);
            //当前行的最后一个元素独立处理
        }
        int minTotal = f[n - 1][0];
        for (int i = 1; i < n; ++i) {
            minTotal = Math.min(minTotal, f[n - 1][i]);
        }
        return minTotal;
    }



    @Test
    public void run(){
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list1=Arrays.asList(-1);
        List<Integer> list2=Arrays.asList(2,3);
        List<Integer> list3=Arrays.asList(1,-1,3);
        List<Integer> list4=Arrays.asList(4,10,8,3);
        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);
        int i = solution_DP(triangle);
        System.out.println(i);


    }
}

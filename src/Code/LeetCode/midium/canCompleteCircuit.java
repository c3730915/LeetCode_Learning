package Code.LeetCode.midium;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class canCompleteCircuit {
    public int solution(){
        int[] gas = new int[]{2,3,4};
        int[] cost = new int[]{3,4,3};
        int restGas=0;

        for (int i = 2; i<3; i++) {
            int fix = i+1;
            Queue<Integer> gasQueue = getQueen(gas,fix);
            Queue<Integer> costQueue = getQueen(cost,fix);
            //i代表当前作为起始加油站的位置
            System.out.println("当前选择的是从第"+fix+"个加油站出发，顺序为：");
            while (!gasQueue.isEmpty())
            {
                int value = gasQueue.poll();
                //在加油站能够获得的汽油
//                System.out.println(value);
                restGas+=value;
                System.out.println("加过油以后剩余油量是："+restGas);

                int val=costQueue.poll();
                restGas-=val;
                if (restGas < 0) {
                    break;
                }
            }
            //开往原始的加油站需要消耗的油
//            restGas-=cost[i];
            if (restGas>=0)
            {
                System.out.println("最终剩余："+restGas);
                return i;
            }

            gasQueue.clear();
            costQueue.clear();

        }
        return -1;


    }
    @Test
    public void run()
    {
        int solution = solution();
        System.out.println(solution);
    }
    public Queue getQueen(int[] cost, int index)
    {
        Queue queue =new LinkedList();
//        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <cost.length ; i++) {
            if (index < cost.length) {
                queue.add(cost[index]);
                index++;
            }else {
                queue.add(cost[index-cost.length]);
                index++;
            }
        }
        return queue;

    }
    //标准答案
//    class Solution {
//        public int canCompleteCircuit(int[] gas, int[] cost) {
//            int n = gas.length;
//            int i = 0;
//
//            // 从头到尾遍历每个加油站，并且检查以该加油站为起点，能否行驶一周
//            while(i < n){
//                int sumOfGas  = 0; // 总共加的油
//                int SumOfCost = 0; // 总共消费的油
//                int count = 0;     // 记录能走过几个站点
//                while(count < n){  // 退出循环的条件是走过所有的站点
    //环形算法！！
//                    int j = (i + count) % n; // 加油站是环形的
//                    sumOfGas += gas[j];
//                    SumOfCost += cost[j];
//                    if(SumOfCost > sumOfGas){ // 如果这个站点发现油不够了
//                        break;
//                    }
//                    count++; // 这个站点满足情况
//                }
//
//                if(count == n){  // 如果能环绕一圈
//                    return i;
//                }else{ // 不行的话 从下一个站点开始 检查
//                    i = i + count + 1;
//                }
//            }
//            // 所有加油站作为起点都不满足
//            return -1;
//        }
//    }
}

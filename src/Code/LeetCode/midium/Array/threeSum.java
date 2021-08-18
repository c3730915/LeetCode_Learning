package Code.LeetCode.midium.Array;

import org.junit.Test;

import java.util.*;

public class threeSum {

    private boolean flag = false;
    private List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> solution_SortedArray(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //双指针
        int len = nums.length;
        for(int i = 0;i < len;++i) {
            if(nums[i] > 0) return lists;

            if(i > 0 && nums[i] == nums[i-1]) continue;

            int curr = nums[i];
            int L = i+1, R = len-1;
            while (L < R) {
                int tmp = curr + nums[L] + nums[R];
                if(tmp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    while(L < R && nums[L+1] == nums[L]) ++L;
                    while (L < R && nums[R-1] == nums[R]) --R;
                    ++L;
                    --R;
                } else if(tmp < 0) {
                    ++L;
                } else {
                    --R;
                }
            }
        }
        return lists;
    }
    @Test
    public void run(){
        int[] input={13,11,-3,-1,6,-11,-11,-12,1,-11,-10,12,3,-11,0,9,3,-13,-10,-2,6,14,9,-4,-9,-3,-9,-15,-10,4,-7,10,1,-3,-5,14,1,-9,-13,-12,-4,-8,7,6,-4,-8,0,6,-14,-3,-11,0,-4,13,3,2,-13,9,2,14,-1,10,10,7,14,12,6,0,-12,0,-5,-9,7,-13,12,10,-13,-3,1,10,9,5,-5,12,-5,13,-1,-11,0,-14,-11,6,3,14,-2,2,11,11,10,6,-4,12,13,10,7,10,5,1};
        int N=3;//组合长度
        int[] output=new int[N];
        dfs(input,output,0,0);
        System.out.println(list.toString());
    }
    public  void dfs(int[] input,int[] output,int index,int start){
        if(index==output.length)//产生一个组合序列
        {
//                System.out.println(Arrays.toString(output));
            if(output[0]+output[1]+output[2]==0)
            {
                //判断列表里是否有相同的结果
//                System.out.println(Arrays.toString(output));
                //在这一步 代码正确

                boolean flag = true;
                for (List<Integer> integers : list) {
                    Set<Integer> stack1 = new HashSet<>();
                    for (Integer integer : integers) {
                        stack1.add(integer);
                    }
                    Set<Integer> stack2 = new HashSet<>();
                    stack2.add(output[0]);
                    stack2.add(output[1]);
                    stack2.add(output[2]);
                    if(output[0]==0&&output[1]==0){

//                        System.out.println(stack1==stack2);
                    }
                    if(integers.contains(output[0])&&integers.contains(output[1])&&integers.contains(output[2])&&stack1.size()==stack2.size()){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    List<Integer> subResult = new ArrayList<>();
                    subResult.add(output[0]);
                    subResult.add(output[1]);
                    subResult.add(output[2]);
                    list.add(subResult);
                }
            }

        }
        else{
            for(int j=start;j<input.length;j++){
                output[index]=input[j];//记录选取的元素
                dfs(input,output,index+1,j+1);//选取下一个元素，可选下标区间为[j+1,input.length]
            }
        }
    }
    List<List<Integer>> solution(int[] nums)
    {
        /**
         * a +b = -c;
         */
        return null;
    }
}

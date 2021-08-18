package Code.LeetCode.midium.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class permute {
    public List<List<Integer>> solution_traceBack(int[] nums)
    {
        /**
         * @res 需要返回的结果列表
         * @path 当前的路径，用栈实现
         * @length 数组的长度
         * @depth 当前深度遍历到的层数
         * @used 用一个数组存储当前数字是否被使用过
         * @算法实现 算法使用回溯的方式实现
         */
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> path = new Stack<>();
        if (length == 0) {
            return res;
        }
        boolean[] used = new boolean[length];
        dfs(nums,length,0,path,used,res);
        return res;
    }

    private void dfs(int[] nums, int length, int depth, Stack<Integer> path, boolean[] used, List<List<Integer>> res) {
        if(depth==length){
            res.add(new ArrayList<>(path));
            //当遍历到叶子结点的时候，把当前路径加入到路径中，但是需要注意如果我们仅仅
            //添加path到res，我们是添加的一个引用，因此在程序即将结束的时候，我们的path
            //应回到根节点，因此我们会得到空结果，所以我们需要手动复制一份
        }
        for (int i = 0; i < length; i++) {
            if(used[i])
            {
                continue;
            }
            path.add(nums[i]);
            used[i]=true;
            //递归操作
            dfs(nums,length,depth+1,path,used,res);
            //回溯的要点，需要把之前的修改回来
            path.pop();
            used[i]=false;

        }

    }
}
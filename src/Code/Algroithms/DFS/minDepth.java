package Code.Algroithms.DFS;

import Code.LeetCode.easy.Tree.TreeNode;
public class minDepth {
    public int minDept_DFS(TreeNode root) {
        /**
         * 思路及解法
         * 首先可以想到使用深度优先搜索的方法，遍历整棵树，记录最小深度。
         * 对于每一个非叶子节点，我们只需要分别计算其左右子树的最小叶子节点深度。这样就将一个大问题转化为了小问题，可以递归地解决该问题。
         */
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(minDept_DFS(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDept_DFS(root.right), min_depth);
        }

        return min_depth + 1;
    }

}

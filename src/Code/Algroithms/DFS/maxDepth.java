package Code.Algroithms.DFS;

import Code.LeetCode.easy.Tree.TreeNode;

public class maxDepth {
    public int maxDepth_DFS(TreeNode root) {
        /**
         * 如果我们知道了左子树和右子树的最大深度 ll 和 rr，那么该二叉树的最大深度即为
         * max(l,r) + 1
         * 而左子树和右子树的最大深度又可以以同样的方式进行计算。因此我们可以用「深度优先搜索」的方法来计算二叉树的最大深度。具体而言，
         * 在计算当前二叉树的最大深度时，可以先递归计算出其左子树和右子树的最大深度，然后在 O(1)O(1) 时间内计算出当前二叉树的最大深度。递归在访问到空节点时退出
         */
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth_DFS(root.left);
            int rightHeight = maxDepth_DFS(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

}

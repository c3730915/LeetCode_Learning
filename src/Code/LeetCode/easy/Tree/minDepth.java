package Code.LeetCode.easy.Tree;

public class minDepth {
    public int solution_DeptFirst(TreeNode root)
    {
        /**
         * 使用深度优先遍历
         */
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(solution_DeptFirst(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(solution_DeptFirst(root.right), min_depth);
        }

        return min_depth + 1;
    }


}

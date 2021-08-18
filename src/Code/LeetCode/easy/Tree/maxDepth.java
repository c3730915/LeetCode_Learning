package Code.LeetCode.easy.Tree;

public class maxDepth {
    /**
     * #104
     * easy
     * BinaryTree
     */
    class Solution {
        public int maxDepth(TreeNode root) {
            return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

        }
    }
}

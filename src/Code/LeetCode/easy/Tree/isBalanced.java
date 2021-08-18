package Code.LeetCode.easy.Tree;

import org.junit.Test;

import java.util.*;

public class isBalanced {
    /**
     * 目前代码还有bug未完成！
     * @param root
     * @return
     */
    public boolean solution(TreeNode root){

        if(root==null){
            return true;
            //为空返回空
        }
        Queue<TreeNode> queue=new LinkedList<>();
        //创建队列，并且把根节点放在其中
        queue.offer(root);
        List<Integer> nerdMaxLength = new ArrayList<>();
        int offset=0;
        while (!queue.isEmpty()) {
            //每次遍历的数量为队列的长度
            int size = queue.size();
            //把这一层的元素全部取出来，放入临时数组，如果节点的左右孩子不为空，也扔到队列里
            for (int i = 0; i <size ; i++) {
                TreeNode node = queue.poll();
                if(offset!=0)
                {
                    int val = maxDepth(node);
                    nerdMaxLength.add(maxDepth(node));
                }
//                levelNord.push(no)
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }

                offset++;
            }
            //对这一层所有节点进行最大深度检测
            if (offset>1)
            {
                if(Collections.max(nerdMaxLength)-Collections.min(nerdMaxLength)>1) {
                    return false;
                }
            }
            nerdMaxLength.clear();
        }
        return false;
    }
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    @Test
    public void run(){
        TreeNode treeNode = setTree2();
        System.out.println(solution(treeNode));
    }
    public TreeNode setTree(){
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(2));

        root.getLeft().setLeft(new TreeNode(3));
        root.getLeft().setRight(new TreeNode(3));
        root.getLeft().getLeft().setLeft(new TreeNode(4));
        root.getLeft().getLeft().setRight(new TreeNode(4));
        return root;
    }
    public TreeNode setTree2(){

        TreeNode root = new TreeNode(3);
        root.setLeft(new TreeNode(9));
        root.setRight(new TreeNode(20));
        root.getRight().setLeft(new TreeNode(15));
        root.getRight().setRight(new TreeNode(7));
        return root;
    }
}

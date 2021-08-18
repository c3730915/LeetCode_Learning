package Code.LeetCode.midium.Tree;

import Code.LeetCode.easy.Tree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public List<List<Integer>>solution(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        List<Integer> tmp = new ArrayList<>();
        while (!queue.isEmpty())
        {
            for (int i = 0; i <queue.size() ; i++) {
                TreeNode pollNerd = queue.poll();
                tmp.clear();
                tmp.add(pollNerd.getVal());
                if (pollNerd.getLeft()!=null){
                    queue.offer(pollNerd.getLeft());
                }
                if (pollNerd.getRight()!=null){
                    queue.offer(pollNerd.getRight());
                }
            }
            result.add(tmp);
        }


        return result;
    }

    @Test
    public void run(){
        TreeNode treeNode = new TreeNode();
        treeNode.setVal(3);
        treeNode.setLeft(new TreeNode(9));
        treeNode.setRight(new TreeNode(20));
        treeNode.getRight().setRight(new TreeNode(15));
        treeNode.getRight().setLeft(new TreeNode(7));
        List<List<Integer>> solution = solution(treeNode);
//        System.out.print`f(solution.toString());
        System.out.printf("");
    }
}

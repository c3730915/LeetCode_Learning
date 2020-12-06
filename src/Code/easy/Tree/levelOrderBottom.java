package Code.easy.Tree;

import org.junit.Test;

import java.util.*;

public class levelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root){

        LinkedList<List<Integer>> result = new LinkedList<>();
        if(root==null){
            return result;
            //为空返回空
        }
        Queue<TreeNode> queue=new LinkedList<>();
        //创建队列，并且把根节点放在其中
        queue.offer(root);
        ArrayList<Integer>tmp=new ArrayList<>();
        while (!queue.isEmpty()) {
            //每次遍历的数量为队列的长度
            tmp.clear();
            int size = queue.size();
            //把这一层的元素全部取出来，放入临时数组，如果节点的左右孩子不为空，也扔到队列里
            for (int i = 0; i <size ; i++) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.left);
                }

            }
            result.add(tmp);

        }
        Collections.reverse(result);
        //反转结果列表 然后返回

        return result;


    }
}

package Code.easy.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class hasPathSum {
     public boolean hasPathSum_RECU(TreeNode root, int sum) {
          /**
           * 运用递归的方式解决问题
           * 如果当前节点为叶子节点 即左右子树都为空那么就判断是否符合
           * 判断根节点是否为空与递归无关，只是第一次的时候判断是否传入的是个空树
           * 因为使用的是 || 因此只要有一个根节点满足条件，那么就会返回true
           */
          if (root == null) {
               return false;
          }
          if (root.left == null && root.right == null) {
               return sum == root.val;
          }
          return hasPathSum_RECU(root.left, sum - root.val) || hasPathSum_RECU(root.right, sum - root.val);
     }
     public boolean hasPathSum_BFS(TreeNode root,int sum){
         /**
          * 运用广度优先的方式，如果到达了根节点那么就判断这一整层的根节点是否满足条件
          */
          if (root == null) {
               return false;
          }
          Queue<TreeNode> queNode = new LinkedList<TreeNode>();
          Queue<Integer>queVal=new LinkedList<Integer>();
          queNode.offer(root);
          queVal.offer(root.val);
         List<Integer> currentPath = new ArrayList<>();
          while (!queNode.isEmpty()) {

              TreeNode now = queNode.poll();
              int temp = queVal.poll();
              currentPath.add(temp);
               if (now.left == null && now.right == null) {
                    //已经到了根节点
                    if (temp == sum) {
                        System.out.println(currentPath);
                         return true;
                    }
                    continue;
                    //这个根节点不符合
               }
               if (now.left != null) {
                    queNode.offer(now.left);
                    queVal.offer(now.left.val+temp);

               }
               if (now.right != null) {
                    queNode.offer(now.right);
                    queVal.offer(now.right.val+temp);

               }
          }


          return false;
     }

}

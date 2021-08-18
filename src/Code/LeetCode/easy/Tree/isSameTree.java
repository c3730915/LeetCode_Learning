package Code.LeetCode.easy.Tree;

import java.util.ArrayList;
import java.util.List;

public class isSameTree {
    /**
     * easy
     * #100
     * BinaryTree,str
     */
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null&&q==null)
            {

                return true;
            }
            if(q==null||p==null)
            {

                return false;
            }
            if(p.val==q.val&&p.left==null&&p.right==null&&q.left==null&&q.left==null)
            {
                System.out.println("1");
                return true;
            }

            trverseTree(p);
            trverseTree(q);
            if(list.size()%2!=0)
            {
                return false;
            }

            System.out.println(list.toString());
            List l1 = list.subList(0,list.size()/2);
            List l2 = list.subList(list.size()/2,list.size());
            System.out.println(l1.toString());

            System.out.println(l2.toString());
            if (l1.equals(l2)){
                return true;
            }else {
                return false;
            }

        }

        List<Integer> list = new ArrayList<Integer>();

        public void trverseTree(TreeNode tree)
        {
            if (tree!=null) {
                list.add(tree.val);
                System.out.println(tree.val);
                trverseTree(tree.left);
                trverseTree(tree.right);
            }else{
                list.add(null);
            }



        }
    }

}

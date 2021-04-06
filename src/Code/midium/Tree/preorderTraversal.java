package Code.midium.Tree;

import Code.easy.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        if(root==null){
            return list;
        }
        dfs(root,list);
        return list;
    }
    public void dfs (TreeNode node,List<Integer> list){
        /**
         * 在二叉树的遍历情况下，只需要改变三个的顺序，此题为先序遍历
         * 如果需要中序，后续 改变顺序即可
         */
       if(node==null){
           return; //如果为空，则返回
       }
        list.add(node.val);
        dfs(node.left,list);
        dfs(node.right,list);

    }
}

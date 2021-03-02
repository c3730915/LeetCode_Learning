package Code.easy.LinkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class reverseList {
    public ListNode solution_stack(ListNode head){
        /**
         * 自己写的，算法需要优化！
         * @辣鸡算法
         */
        Stack<ListNode> stack = new Stack<>();
        while (head.next != null) {
            stack.push(head);
            head=head.next;
        }
        stack.push(head);
        ListNode ptr = new ListNode(0,null);
        ListNode result = ptr;
        while (!stack.isEmpty())
        {
            ptr.val = stack.pop().val;
            if (stack.isEmpty())
            {
                ptr.next=null;
                break;

            }
            ptr.next=new ListNode(0);
            ptr=ptr.next;
        }
        return result;

    }
    public ListNode solution_Best(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public List<Integer> iterateList(ListNode node_origal){
        ListNode node = node_origal;
        List<Integer> list = new ArrayList<>();
        while (node.next!=null){
            list.add(node.val);
            node=node.next;
        }
        list.add(node.val);
        return list;

    }
    @Test
    public void run(){
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,null)));

        ListNode solution = solution_Best(head);
        List<Integer> list = iterateList(solution);
        System.out.println(list);
    }
}

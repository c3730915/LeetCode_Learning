package Code.Top100.medium;

import Code.LeetCode.easy.LinkedList.ListNode;

public class addSumLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode prev = new ListNode(0);
            ListNode curr = prev;
            int carry = 0;
            while(l1.next != null || l2.next !=null){
                int x = l1 == null?0:l1.val;
                int y = l2 == null?0:l2.val;
                int sum = (x + y + carry) ;
                carry = sum / 10;
                sum = sum % 10;
                curr.next = new ListNode(sum);
                curr = curr.next;
                if(l1!=null){
                    l1 = l1.next;
                }
                if(l2 != null){
                    l2 = l2.next;
                }

            }
            if(carry == 1) {
                curr.next = new ListNode(carry);
            }
            return prev.next;

        }
    }
}

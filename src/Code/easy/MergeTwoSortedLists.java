package Code.easy;

public class MergeTwoSortedLists {
     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 public void Solution(){
     ListNode l1 = new ListNode(1,
             (new ListNode(2,
                     new ListNode(4,
                             null))));
     while (l1.next != null)
     {
         System.out.println(l1.val);
     }





     }
}

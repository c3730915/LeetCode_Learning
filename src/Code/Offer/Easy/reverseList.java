package Code.Offer.Easy;

public class reverseList {
    public ListNode reverseList(ListNode head) {
        //维护一个先驱节点
        ListNode prev = null;
        ListNode currNode = head;
        while (head.next!=null){
            //如果head下一个不为空 那么将当前节点指向前一个节点
            ListNode next = currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode = next;

        }
        return prev;
    }
}

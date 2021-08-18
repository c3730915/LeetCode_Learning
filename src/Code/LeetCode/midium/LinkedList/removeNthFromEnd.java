package Code.LeetCode.midium.LinkedList;

public class removeNthFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int lengthOfList(ListNode head){
        //@utils
        //@return return the length of List
        ListNode head_dump = head;
        int length =0;
        while(head_dump.next!=null){
            length++;
            head_dump=head_dump.next;
        }
        return ++length;
    }
    public ListNode solution_own(ListNode head, int n) {
        //自己写的题解
        int length = lengthOfList(head);
        if(length==0){
            return head;
        }
        if(length==1&&n==1){
            return null;
        }
        //判断如果被删除的是头节点
        if(length==n){
            head=head.next;
            return head;
        }
        ListNode head_dump = head;
        for(int i =0;i<length-n-1;i++){
            head_dump=head_dump.next;
        }
        System.out.println("previous that is being deleted node is:"+head_dump.val);
        //System.out.println("length is"+length);
        head_dump.next=head_dump.next.next;
        return head;

    }

}

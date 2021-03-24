package Code.Offer.Easy;

public class getKthFromEnd {
    public ListNode solution(ListNode head, int k){
        if(head==null){
            return head;
        }
        ListNode head_bak = head;
        int length =0;
        while (head_bak.next!=null){
            length++;
        }
        length++;
        //倒数第k 就是正数第 length -k
        //若length = 3 倒数第2 就是正数第2 即为3-2 
        int targetIndex = length-k;
        for (int i = 0; i < targetIndex; i++) {
            head = head.next;

        }
        return head;

    }
}

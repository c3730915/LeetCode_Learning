package Code.Offer.Easy;

import org.junit.Test;

import java.util.Stack;

public class reversePrintList {
    public int[] solution(ListNode head)
    {
        if (head == null) {
            return new int[0];
        }
        Stack<Integer>stack = new Stack<>();

        while (head.next != null) {
            stack.push(head.val);
            head=head.next;
        }
        stack.push(head.val); //把最后一个 val加进去
//        System.out.println(stack.size());
        int length = stack.size();
        int result[] = new int[length];
        for (int i = 0; !stack.empty(); i++) {
            result[i]=stack.pop();

        }
        return result;
    }
    @Test
    public void run(){

    }
}

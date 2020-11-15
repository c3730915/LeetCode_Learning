import org.junit.Test;

import java.math.BigInteger;
import java.util.List;
import java.util.Stack;

public class addNumbers {

   public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public BigInteger ListTonum(ListNode l1){

      StringBuilder sBuilder = new StringBuilder();
      Stack<Integer> stack=new Stack<Integer>();
      BigInteger num2;
      while(l1!=null){
          stack.push(l1.val);
          if (l1.next != null) {
              l1 = l1.next;
          }else{
              break;
          }
      }

      while(!stack.isEmpty())
      {
          sBuilder.append(stack.pop().toString());
      }
      BigInteger num1 = new BigInteger(sBuilder.toString());
      return num1;
  }
  public void traverseList(ListNode l1){
      while(l1!=null){
          System.out.println(l1.val);
          if (l1.next != null) {
              l1 = l1.next;
          }else{
              break;
          }
      }
  }
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       BigInteger sum = ListTonum(l1).add( ListTonum(l2));
       String strSum=sum.toString();
       char[] chars = strSum.toCharArray();
       ListNode listNode = new ListNode();
       ListNode head = listNode;
       for (int i = 0; i <chars.length ; i++) {
          listNode.val=chars[i]-'0';
          listNode.next=new ListNode();
          listNode=listNode.next;

       }
       traverseList(head);
       return new ListNode();


   }
   @Test
   public void run(){
      ListNode l1 = new ListNode(1);
      l1.next=new ListNode(2);
      l1.next.next=new ListNode(3);
      addTwoNumbers(l1,l1);
   }
}

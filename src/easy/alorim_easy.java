package easy;

import org.junit.Test;

import java.util.*;

public class alorim_easy {
    @Test
     public void run(){
        addBinary("1","111");

    }
    static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){return i;}

        }
        return nums.length;


    }
    static String countAndSay(int n){
        int num1,num2,num_cout; //num1 个 num2,因此写作num_cout

        num1=1;
        num2=1;


        return null;
    }

    static public int lengthOfLastWord(String s) {


        if (s.trim().equals("")) {
            return 0;
        }



        // String str = "abc fafa";
        String[] str_array = s.split(" ");
        System.out.println(Arrays.toString(str_array));

        int final_word_length = (str_array[str_array.length-1]).length();

        return final_word_length;

    }

    static public int[] plusOne_bug(int[] digits) {
        //转化为字符串


        // String str="";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            // str.append(((Integer)digits[i]).toString());
            str.append(digits[i]);


        }
        // System.out.println(str.toString());

        Integer number = Integer.parseInt(str.toString())+1;
        String length = number.toString();
        // System.out.println(length.length());

        int[] returnArray = new int[length.length()];
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i]=length.charAt(i)-'0';
        }

        return returnArray;

    }

    static public int[] plusOne(int[] digits) {

        int index =digits.length-1;
        int flag=0;
        while(index>=0){

            if(digits[index]+flag>9)
            {
                digits[index]=0;
                flag=1;

            }else{
                flag = 0;
                break;

            }
            index --;

        }

        if(flag==1){
            int[] array = new int[digits.length+1];
            array[0]=1;
            return array;

        }else
        {
            return digits;
        }

        // return new int[]{1};
    }
    static public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    static public String addBinary(String a, String b) {
        boolean flag =true;

        if (a.length()<b.length())
        {
            String temp =a;
            a=b;
            b=temp;

        }
        StringBuilder sbA = new StringBuilder(a);
        StringBuilder sb = new StringBuilder(b);
        //add 0 before a,in order to prevent overflowing
        sbA.insert(0,'0');
       a=sbA.toString();
        for (int i = 0; a.length()-b.length()-i>0 ; i++) {

            sb.insert(0, '0');
        }
       b=sb.toString();
        //now a and b have the same length
        boolean flow = false;
        int currentNum_a;
        int currentNum_b;
        StringBuilder result = new StringBuilder();


        for (int i = a.length()-1; i >0; i--) {
//            int currentNum_a =Integer.parseInt(String.valueOf(a.charAt(i))) ;
            if (flow){
                currentNum_a = a.charAt(i)-'0'+1;
                currentNum_b = b.charAt(i)-'0';
                flow =false;
            }else {
                 currentNum_a = a.charAt(i)-'0';
                 currentNum_b = b.charAt(i)-'0';
                 flow = false;
            }
            if (currentNum_a+currentNum_b==0)
            {
                result.insert(0,'0');
                flow = false;
            }else if (currentNum_a+currentNum_b==1)
            {
                result.insert(0,'1');
                flow = false;
            }else if(currentNum_a+currentNum_b==2)
            {
                result.insert(0,'0');
                flow = true;

            }
            else if(currentNum_a+currentNum_b==3)
            {
                result.insert(0,'1');
                flow = true;

            }

    }
//        if ()
        if (flow==true)
        {
            result.insert(0,'1');
        }


        System.out.println(result.toString());
        return null;

    }
     public void deleteDuplicates()
    {
        //123
//        int currentPosi=0;
        ListNode head = new ListNode(-1);

        ListNode current = head;
        System.out.println("current list");
        for (int i = 0; i <6 ; i++) {
            current.next =new ListNode(2);
            current=current.next;


        }
        ListNode prev = head;
        ListNode temp = head.next;
        Stack stack = new Stack();
        System.out.println("after changing list");
        while (temp.next!=null)
        {
            prev=prev.next;
            temp=temp.next;
            if (!stack.contains(temp.val))
            {
                stack.push(temp.val);
            }else {
                prev.next=temp.next;
                
            }
            System.out.println(temp.val);

        }




    }
    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static public boolean isSameTree()
    {
        TreeNode q = new TreeNode(1);
        q.left=new TreeNode(2);
        q.right=new TreeNode(3);
        return true;

    }
    public int maxDepth_rec(TreeNode root)
    {
        return root == null ? 0 : Math.max(maxDepth_rec(root.left), maxDepth_rec(root.right)) + 1;
    }

    public int maxDepth_BFS(TreeNode root)
    {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        int ans=0;  //store the result
        while (!queue.isEmpty())
        {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();   //pop up from head
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;

            }
            ans++;
        }
        return ans;


    }

}

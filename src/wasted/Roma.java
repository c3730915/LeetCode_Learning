package wasted;

import java.math.BigInteger;
import java.util.Stack;


public class Roma{

    public void del_duplicate_array(){
        int[] nums = new int[] {1,1,1,2,2,3,3,4,5};
        if(nums.length ==0 ||nums.length==1)
        {
            System.out.println(nums.length);
        }
        int p=0,q=1;
        while(q<nums.length){
            if(nums[p]!=nums[q])
            {

                nums[p+1]=nums[q];
                q++;
                p++;
            }
            else{
                q++;
            }
        }
        System.out.println(p+1);
        
        
        
    }
    
    

    public boolean valid_parenthesis_expression()
    {
        Stack<Character> stack = new Stack();
        String str = "()[]{}";
        for(char a :str.toCharArray()){
            if(a == '(')
            {
                stack.push(')');
            }
            if(a == '{')
            {
                stack.push('}');
            }
            if(a == '[')
            {
                stack.push(']');
            }
            else
            {
                if(stack.empty()|| a!= stack.pop())
                {
                    return false;
                }
            }
        }
        return true;

        


    } 

    public int strStr(String haystack, String needle) {
        if(! haystack.contains(needle)){return -1;}
        else {
            return haystack.indexOf(needle);
        }


    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            // not found target
        }
        for (int j = 0; j < nums.length; j++) {
            if (target >= nums[j]) {
                return j;

            }

        }
        return 0;

    }

    public int maxSubArray(int[] nums) {

        int max_val=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                
            }
            if(sum>max_val){
                max_val=sum;
                
            }
            sum =0;
            //注意sum一定要清零!!

            
        }
        return max_val;

    }
    public static int studyRecursion(int n){
        if(n==1)
        {
            return (1);
        }
        else{
            System.out.println(n);
            System.out.println("------");

            return studyRecursion(n*(n-1));
        }
        
        




    }
    public static int climbStairs(int n){



        int x=1;//1jie
        int y; //2jie
        int sum=0;
        while(x<=n)
        {
            y=(n-x)%2;
            x++;
            if(y==0)
            {
                sum++;
            }

        }
        System.out.println(sum+1);


        return 0;
    }
  static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers (ListNode l1,ListNode l2)
    {
        StringBuilder sBuilder = new StringBuilder();
        Stack <Integer>stack=new Stack<Integer>();
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

        return new ListNode();

    }
    
    
    
    public static void main(String[] args) {
        Roma roma =new Roma();
        // int index;
        // // index=roma.searchInsert(new int[]{1,3,5,6},5);
        // index = roma.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        // System.out.println(index);
        // roma.studyRecursion(4);
        // roma.climbStairs(2);
        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);

        roma.addTwoNumbers(l1, l1);

        

    }
    
}
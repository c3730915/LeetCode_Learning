package Code.LeetCode.easy.Stack;


import java.util.Deque;
import java.util.LinkedList;

public class CQueue {
    /**
     * 使用两个栈来实现双向队列（队尾加入，队头删除）
     */
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        //把栈1循环捣腾到栈2，这样就是删除顺序
        // 如果第二个栈为空
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
            //如果栈2还是空，那么就报错
        } else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }
}

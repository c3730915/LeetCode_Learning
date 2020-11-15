package Code.easy.Stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String str) {
        /**
         * easy
         * #20
         * stack
         *
         */
        Stack<Character> stack = new Stack();

        for(char a :str.toCharArray()){
            if(a == '(')
            {
                stack.push(')');
            }
            else if(a == '{')
            {
                stack.push('}');
            }
            else if(a == '[')
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
        return stack.isEmpty();





    }
}


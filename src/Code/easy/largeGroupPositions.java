package Code.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class largeGroupPositions {
    public List<List<Integer>>solution_stack_BUG(String s){
        if(s.length()<3){
            return new ArrayList<>();
        }
        List<List<Integer>> reslut = new ArrayList<>();

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        if (s.length()!=0){
            stack.push(chars[0]);
            //加入第一个元素 防止peek抛出异常
        }
        for (int i = 1; i < chars.length; i++) {
            if(stack.peek()==chars[i]){
                //如果堆顶部元素等于下一个元素，意味着当前组还能继续延续
                stack.push(chars[i]);
            }
            if (!stack.contains(chars[i])||i==chars.length-1){
                if (stack.size()>=3){
                    //发现一组
                    if(i==chars.length-1){
                        Integer start = i-stack.size()+1;
                        Integer end = i;
                        reslut.add(Arrays.asList(start,end));
                    }else {
                        Integer start = i - stack.size();
                        Integer end = i - 1;
                        reslut.add(Arrays.asList(start, end));
                    }
                }
                stack.clear();
                stack.push(chars[i]);

            }


        }
        System.out.println(reslut.toString());
        return reslut;
    }


    public List<List<Integer>>solution_for(String s){
        if(s.length()<3){
            return new ArrayList<>();
        }

        List<List<Integer>> reslut = new ArrayList<>();
        int prev=0;
        int next=prev+1;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[prev]==chars[next]){
                next++;
            }else {
                if(next-prev>=2)
                {
                    reslut.add(Arrays.asList(prev,next));
                }
                //寻找下一组
//                if()
                prev=next;
                next++;

            }

        }
        return reslut;
    }

    @Test
    public void run(){
//        solution("aaaabbb");
        List<List<Integer>> lists = solution_for("aaaabbb");
        System.out.println(lists.toString());
    }
}

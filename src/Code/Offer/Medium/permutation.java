package Code.Offer.Medium;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class permutation {
    private Logger logger = Logger.getLogger(this.getClass().getName());
    public String[] solution(String s){
        //维护set作为结果集
        Set<String> res = new HashSet<>();
        backtrack(s.toCharArray(), "", new boolean[s.length()], res);
        logger.info(res.toString());
        return res.toArray(new String[res.size()]);
    }

    private void backtrack(char[] chars, String temp, boolean[] visited, Set<String> res) {
        //边界条件判断，当选择的字符长度等于原字符串长度的时候，说明原字符串的字符都已经
        //选完了
        if (temp.length() == chars.length) {
            res.add(temp);
            return;
        }
        //每一个节点我们都要从头开始选
        for (int i = 0; i < chars.length; i++) {
            //已经选择过的就不能再选了
            if (visited[i])
                continue;
            //表示选择当前字符
            visited[i] = true;
            //把当前字符选择后，到树的下一层继续选
            backtrack(chars, temp + chars[i], visited, res);
            //递归往回走的时候要撤销选择
            visited[i] = false;
        }
    }

    @Test
    public void test(){
        solution("abcd");
    }
}

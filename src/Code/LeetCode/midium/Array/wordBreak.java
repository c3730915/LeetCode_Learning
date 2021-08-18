package Code.LeetCode.midium.Array;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class wordBreak {
    public boolean solution(String s, List<String> wordDict){
        //双指针
//        StringBuilder
        int ptrSlow=0;
        int ptrFast=1;
        boolean flag = false;
        for (int i = 0; i <s.length() ; i++) {
            String substring = s.substring(ptrSlow, ptrFast);
            System.out.println("substr=="+substring);
            flag = wordDict.contains(substring);
            System.out.println(flag);
            if (flag) {
                //如果能够成功分割，重新定义双指针
                ptrSlow=i+1;
                ptrFast=ptrSlow+1;
            }
            else {
                ptrFast++;//如果没有匹配，快指针向后移动
            }

        }
        return flag;
    }
    @Test
    public void test(){

        LinkedList<String> dict = new LinkedList<>();
        dict.add("aaaa");
        dict.add("aaa");
//        dict.add("sand");
        boolean result = solution("aaaaaaa", dict);
        System.out.println(result);

    }
}

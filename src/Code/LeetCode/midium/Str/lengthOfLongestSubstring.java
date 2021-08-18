package Code.LeetCode.midium.Str;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public void solution(String s){
        if(s==null){
//            return 0;
        }
        int strLength = s.length();
        int maxSize=0;
        Set<Character>set=new HashSet<Character>();
        int p1=0,p2=0;

        for (int i = 0; i <strLength ; i++) {
            //p1 每一个字符进行遍历
            p1=p2=i;
            //p1对所有字符进行遍历，p2则是p1后面的，对p1往后的进行遍历

            for (int j = 0; j <strLength-i ; j++) {

                if(!set.contains(s.charAt(p2)))
                {
                    set.add(s.charAt(p2));
                    p2++;
                }else {
                   if (set.size()>maxSize)
                   {
                       maxSize=set.size();
                   }
                   set.clear();
                   break;

                }
                if (set.size()>maxSize)
                {
                    maxSize=set.size();
                }



            }

        }
        System.out.println(maxSize);
    }
    @Test
    public void run()
    {
        solution(" ");
    }
}

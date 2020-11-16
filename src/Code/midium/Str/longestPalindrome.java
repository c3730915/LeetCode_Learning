package Code.midium.Str;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class longestPalindrome {
    public String solution(String s){
        StringBuilder stringBuilder = new StringBuilder();
        int maxLength=0;
        String resStr =null;
        int p1=0,p2=0;
        int strLength=s.length();
        for (int i = 0; i <strLength ; i++) {
            p1 = p2 = i;
            for (int j = 0; j < strLength - i; j++) {
                stringBuilder.append(s.charAt(p2));
                if(stringBuilder.length()>maxLength)
                {
                    String tmp = stringBuilder.toString();
                    if (checkPalindrome(tmp))
                    {
                        maxLength=tmp.length();
                       resStr = tmp;
                    }

                }
                p2++;
            }
            stringBuilder.setLength(0);
        }
        //使用类似游标一样的 /-----/这种数据结构，然后依次移动 如果移动完了发现没有 na'me'jian'shao
        System.out.println(maxLength);
        System.out.println(resStr);
        return resStr;

    }

    public boolean checkPalindrome(String str){
        if (str.length()%2==0)
        {
            for (int i = 0; i <str.length() ; i++) {
                if(str.charAt(i)!=str.charAt(str.length()-i-1))
                {
                    return false;
                }

            }
            return true;
        }else {
            int times=str.length()/2;
            //双指针开始判断
            for (int i = 0; i <times ; i++) {
                if (str.charAt(i)!=str.charAt(str.length()-i-1))
                {
                    return false;
                }

            }
            return true;
        }
    }
    @Test
    public void run(){
//        boolean flag= checkPalindrome("abacaba");
//        System.out.println(flag);
//        solution("cbbd");
        boolean flag = checkPalindrome("tattarrattat");
        System.out.println(flag);

    }
}

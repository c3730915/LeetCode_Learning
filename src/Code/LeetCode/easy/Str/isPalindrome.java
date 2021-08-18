package Code.LeetCode.easy.Str;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Stack;

public class isPalindrome {
    public boolean soluiton_str(String s) {
        char[] chars = s.toCharArray();
        if (s.equals("")){
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            if (Character.isLetterOrDigit(aChar))
                stringBuilder.append(Character.toLowerCase(aChar));
        }
        //处理过后的str
        String str = stringBuilder.toString();
        boolean flag = true;
        if (str.length()%2==0){
            //长度为偶数
            for (int i = 0; i <str.length()/2 ; i++) {
                if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                    flag=false;
                    break;
                }

            }

        }else {
            for (int i = 0; i <str.length()-1/2 ; i++) {
                if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                    flag=false;
                    break;
                }

            }
        }
        return flag;
    }
    @Test
    public void test(){
        System.out.println(soluiton_str("race a car"));
//        System.out.println(Character.isLetterOrDigit('&'));
    }
}

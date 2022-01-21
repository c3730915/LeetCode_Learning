package Code.Top100.medium;

import java.util.HashMap;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() ==0)
            return 0;
        int maxSize = 0;
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for ( int i = 0; i <s.length() ; i++ ) {
            if ( map.containsKey( s.charAt( i ) ) ){
                //更新左边界 +1 的目的是刚好到能够排除上一个字符出现的位置
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            //每次都需要更新最大长度
            maxSize = Math.max(maxSize,i-left+1);

        }
        return maxSize;
    }
}

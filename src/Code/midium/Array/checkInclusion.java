package Code.midium.Array;

import java.util.HashMap;

public class checkInclusion {
    /**
     * 567:给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
     * 换句话说，第一个字符串的排列之一是第二个字符串的子串。
     */
    public boolean solution(String s1, String s2)
    {
        int len1 = s1.length();
        int len2 = s2.length();

        if(len1 > len2)
            return false;

        HashMap<Character, Integer> mapS1  = new HashMap<>();
        HashMap<Character, Integer>  mapS2 = new HashMap<>();

        for(char ch : s1.toCharArray())
            mapS1.put(ch, mapS1.getOrDefault(ch, 0) + 1);
        //getOrDefault：used to get the value mapped with specified key.
        // If no value is mapped with the provided key then the default value is returned.

        int index = 0;
        for(int i = 0; i < len1; i++, index++){
            char ch = s2.charAt(i);
            mapS2.put(ch, mapS2.getOrDefault(ch, 0) + 1) ;
        }

        while(index < len2){
            if(mapS2.equals(mapS1))
                return true;

            char before = s2.charAt(index - len1);
            char after  = s2.charAt(index);

            mapS2.put(before, mapS2.get(before) - 1);
            if(mapS2.get(before) == 0)
                mapS2.remove(before);
            mapS2.put(after, mapS2.getOrDefault(after, 0) + 1);

            index++;
        }

        return mapS2.equals(mapS1);



    }
}

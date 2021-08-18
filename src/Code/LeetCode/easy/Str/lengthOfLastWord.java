package Code.LeetCode.easy.Str;

import java.util.Arrays;

public class lengthOfLastWord {
    /**
     * easy
     * #58
     * str
     * @param s
     * @return
     */
        public int solution(String s) {
            if(s.trim().equals("")){
                return 0;
            }

            String[] str_array = s.split(" ");
            System.out.println(Arrays.toString(str_array));

            int final_word_length = (str_array              [str_array.length-1]).length();

            return final_word_length;
        }
}

package Code.easy.Str;

import org.junit.Test;

public class PalindromeNumber {
    /**
     * easy
     * #9
     * str,Integer
     * @param number
     * @return
     */
    public boolean solution(int number){
        String str_number = Integer.toString(number);
//        System.out.println(str_number);
        if (number < 0) {
            return false;
        }
        for (int i = 0; i < (int)str_number.length()/2; i++) {
//            System.out.println(str_number.charAt(i));
            if (str_number.charAt(i)!= str_number.charAt(str_number.length()-1-i))
            {
                return false;
            }
            
        }
        return true;

    }
}

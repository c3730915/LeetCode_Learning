package easy;

import org.junit.Test;

public class PalindromeNumber {
    @Test
    public void run(){

        System.out.println(solution(1234321));
    }
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

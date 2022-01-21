package Code.Top100.medium;

import org.junit.Test;

public class longestPalindrome {
    public String longestPalindrome_solution(String s) {
        int left = 0;
        int length = s.length() ;
        for ( int i = 0; i < s.length(); i++ ) {
            String subStr = s.substring( left,left );
            if ( ifPalindrome( subStr ) ){
                return subStr;
            }
        }
        return "";
    }
    public boolean ifPalindrome(String str){
        return new StringBuffer( str ).reverse().toString().equals( str );
    }

    @Test
    public void test(){
//        longestPalindrome_solution( "abcd" );
        System.out.println( ifPalindrome( "aaa" ) );

    }
}

package Code.LeetCode.midium.Str;

import org.junit.Test;

import java.util.Collections;

public class ReverseInt {
    public int reverse(int x ){
        if ( x<0 ){
            String str = String.valueOf( -x );
            StringBuilder sb = new StringBuilder();
            //reverse str
            char[] chars = str.toCharArray();
            for ( int i = 0; i < chars.length; i++ ) {
                sb.append( chars[chars.length-i-1]);
            }
            try {
                Integer value = Integer.valueOf( "-" + sb.toString() );
                return value;
            }catch ( Exception e ){
                return 0;
            }

        }else {
            String str = String.valueOf( x );
            StringBuilder sb = new StringBuilder();
            //reverse str
            char[] chars = str.toCharArray();
            for ( int i = 0; i < chars.length; i++ ) {
                sb.append( chars[chars.length-i-1]);
            }
            try {
                Integer value = Integer.valueOf( sb.toString() );
                return value;
            }catch ( Exception e ){
                return 0;
            }

        }
    }
    @Test
    public void test1(){
        System.out.println( reverse( -123 ) );
//        System.out.println( Integer.valueOf( "-001" ) );
    }
}

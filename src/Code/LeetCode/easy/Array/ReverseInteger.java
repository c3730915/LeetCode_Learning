package Code.LeetCode.easy.Array;

import org.junit.Test;

public class ReverseInteger {
    /**
     * easy
     * #7
     * array
     * @param x
     * @return
     */
    public int reverse(int x) {
        int y = 0;
        while (x != 0) {
            if (y > 214748364 || y < -214748364) {
                return 0;
            }
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return y;
    }
    @Test
    public void run(){
        System.out.println(reverse(3421));
    }
}

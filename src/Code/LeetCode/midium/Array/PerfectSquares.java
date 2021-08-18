package Code.LeetCode.midium.Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PerfectSquares {
   @Test
   public void listAllSqures(){
       int num = 12;
       for (int i = 1; i < num; i++) {
           checkPerfectSquare(i);

       }

   }


    @Test
    public void solution_myself()
    {
//        getAllPerfectSquares(10);


    }

    /**
     * return an array which contains all the perfect squares from m to n
     * @param number
     * @return
     */
    static boolean checkPerfectSquare(int number)
    {
    //calculating the square root of the given number
        double sqrt=Math.sqrt(number);
    //finds the floor value of the square root and comparing it with zero
        if (sqrt - Math.floor(sqrt) == 0){
            System.out.println(number);
        }
        return true;


    }
}

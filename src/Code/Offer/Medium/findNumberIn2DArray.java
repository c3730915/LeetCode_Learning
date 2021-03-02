package Code.Offer.Medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class findNumberIn2DArray {
    public boolean solution_Str(int[][] matrix, Integer target){
        if(matrix.length==0){
            return false;
        }
        if(matrix[0].length==0)
        {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] ints : matrix) {
           stringBuilder.append(Arrays.toString(ints));
        }
        int indexOf =stringBuilder.toString().replace("]",", ").replace('[',' ').indexOf(" "+target.toString()+",");
        return indexOf>-1?true:false;

    }
    @Test
    public void run(){
        int[][] matrix = new int[][]
                {{1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        solution_Str(matrix,20);
    }
}

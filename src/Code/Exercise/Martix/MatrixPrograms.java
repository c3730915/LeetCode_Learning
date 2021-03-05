package Code.Exercise.Martix;

import org.junit.Test;

import java.util.Arrays;

public class MatrixPrograms {
    public void trverseByColumns(int[][]array){
        int columnSize = array.length;
        int rowSize = array[0].length;
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                System.out.println(array[i][j]);

            }
            System.out.println("======");
        }
    }
    public void trverseByRow(int[][]array){
        int columnSize = array.length;
        int rowSize = array[0].length;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j <columnSize; j++) {
                System.out.println(array[j][i]);

            }
            System.out.println("======");
        }
    }

    @Test
    public void run(){

        int[][] array = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        trverseByRow(array);
    }
}

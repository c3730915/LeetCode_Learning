package Code.LeetCode.easy.Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangle {
    public List<List<Integer>>solution_bug(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <numRows ; i++) {
            //一共有numRows行
            //第i行有i+1个元素
            int initialCapacity = i+1;
            int[] currentRow = new int[initialCapacity];
            for (int j = 0; j <initialCapacity ; j++) {
                currentRow[0]=1;
                currentRow[initialCapacity-1]=1;
                
            }
            List<Integer>list=Arrays.stream(currentRow).boxed().collect(Collectors.toList());
            result.add(list);
        }
        return result;


//        return null;

    }

    public class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ret = new ArrayList<List<Integer>>();
            for (int i = 0; i < numRows; ++i) {
                List<Integer> row = new ArrayList<Integer>();
                for (int j = 0; j <= i; ++j) {
                    if (j == 0 || j == i) {
                        row.add(1);
                    } else {
                        //拿到上一个列表的当前元素的前一个，以及当前元素 并且相加
                        row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                    }
                }
                ret.add(row);
            }
            return ret;
        }
    }

    @Test
    public void run(){
        List<List<Integer>> solution = solution_bug(2); //        System.out.println(solution.toString());
    }
}

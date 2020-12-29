package Code.easy.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleRow {
    public List<Integer> getRow(int numRows) {

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
        return ret.get(numRows);
    }
}

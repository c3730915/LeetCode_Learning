package Code.midium.Array;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class singleNumber {

    public int solution_myown(int[] nums){

        int length = nums.length;
        Set<Integer> setNums = new HashSet<>();
        Set<Integer> setResult = new HashSet<>();//存储已经出现三次的数字
        for (int num : nums) {
            if (setNums.contains(num))
            {
                setResult.add(num);
            }else {
                setNums.add(num);
            }

        }
        // setResult处理完毕
        setNums.clear();
        for (int num : nums) {
            setNums.add(num);
        }

        setNums.removeAll(setResult);
        for (Integer setNum : setNums) {
            return setNum.intValue();
        }
        return 0;
    }
    public int solution_HashMap(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int num : nums)
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);

        for (int k : hashmap.keySet())
            if (hashmap.get(k) == 1) return k;
        return -1;
    }
    @Test
    public void test(){
        int[]nums = new int[]{99,0,1,0,1,0,1};

//        System.out.println(result);
    }
}

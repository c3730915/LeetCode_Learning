package test.old;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test3 {
    @Test
    public void disJoinList(){
        List<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("5","4","9"));
        List<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("5","2","3"));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(Collections.disjoint(list1,list2));
    }
    @Test
    public void bitwise(){
        Integer feature = 0 | 16 |8;
        System.out.println(feature);
    }
}

package test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test5 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,10,20};
        IntStream parallel = Arrays.stream(array).parallel();
//        IntStream parallel = Arrays.stream(array);
        parallel.filter(a -> a>10).forEach(System.out::println);
    }

}

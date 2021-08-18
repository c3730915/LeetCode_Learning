package Code.LeetCode.easy.Str;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
    /**
     * easy
     * #14
     * Str,array
     */
    @Test

    public void solution() {
        String[] args = new String[]{"",""};
        List<String> list = Arrays.asList(args);
        int min_str_size=10000;
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).length() < min_str_size) {
                min_str_size = list.get(i).length();
            }
        }
        String first_Prefix = null;
        for (int i = 1; i <= min_str_size; i++) {
            first_Prefix= list.get(0).substring(0, i);
            for (int j = 1; j < list.size(); j++) {
                if (!list.get(j).substring(0,i).equals(first_Prefix)){
                    System.out.println(first_Prefix.substring(0,i-1));

                }

            }


        }
        if (min_str_size==first_Prefix.length()) {
            System.out.println(first_Prefix);
        }
    }

//    public void solution(){
//        String[] args = new String[]{"flower","flow","flight"};
//        List<String> list= Arrays.asList(args);
//        int min_str_size=10000;
//        List<String> data = new ArrayList<String>(list.size()*min_str_size);
//        for (int i = 0; i <list.size() ; i++) {
//            if (list.get(i).length()<min_str_size)
//            {
//                min_str_size = list.get(i).length();
//            }
//
//
//        }
////        System.out.println(min_str_size);
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < min_str_size; j++) {
//                data.add(list.get(i).substring(0,j+1));
//
//
//            }
////            System.out.println(list.get(i).substring(0,i));
////            System.out.println("=======================");
//        }
//        for (int i = 0; i < min_str_size; i++) {
////            if (data.get(i).equals(data.get(i*min_str_size)))
//            for (int j = 0; j < list.size(); j++) {
//                if(data.get(j*min_str_size).equals(data.get(0)){
//
//                }
//
//            }
//
//        }
//
//
//
//        }


}

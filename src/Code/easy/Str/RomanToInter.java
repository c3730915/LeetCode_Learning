package Code.easy.Str;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RomanToInter {
    /**
     * easy
     * #13
     * str,HashMap
     */
    @Test public void run(){
        solution();
    }
    public void solution(){
        int sum = 0 ;
        int right_value = 0;
        int current_value =0;
        String symbol = "LVIII";
        //        Map<String,Integer> map = Map.of("I",1,"V",5,"X",10,"L",50,"C",100,"D",500,"M",1000);
        Map<String,Integer> map = new HashMap<>(10);
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        for (int i = 0; i < symbol.length(); i++) {
            String current_str = String.valueOf(symbol.charAt(i));
           current_value = map.get(current_str);
//            System.out.println(String.valueOf(current_value));
            if (i<symbol.length()-1) //防止溢出操作
            {
                String current_right_str =String.valueOf(symbol.charAt(i+1));
                right_value = map.get(current_right_str);
//                System.out.println(String.valueOf(right_value));

            }
//            System.out.println("---------------------------------");
           if(current_value>=right_value){
               sum = sum+current_value;
           }else {
               sum = sum -current_value;
           }

        } //for loop ends
        System.out.println(sum);


    }

}

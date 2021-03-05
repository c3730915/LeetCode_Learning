package Code.BlueBridge;

import org.junit.Test;

public class MakeDoor {
    @Test
    public void test(){
        int result = 0;
        for (int i = 1; i <=2020 ; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            for (char aChar : chars) {
                if (aChar =='2'){
                    result++;
                }
            }


        }
        System.out.println(result);

    }
}

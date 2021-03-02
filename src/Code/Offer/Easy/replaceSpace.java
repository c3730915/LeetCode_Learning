package Code.Offer.Easy;

import org.junit.Test;

public class replaceSpace {
    public String solution(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==' ')
            {
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(s.charAt(i));
            }

        }
        return stringBuilder.toString();
    }
    @Test

    public void test()
    {
        String solution = solution("ab c d e");
        System.out.println(solution);
    }

}

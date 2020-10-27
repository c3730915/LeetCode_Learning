package easy;

import org.junit.Test;

public class run {
    @Test
    public void run_code_Valid(){
        ValidParentheses validParentheses = new ValidParentheses();
        boolean valid = validParentheses.isValid("()");
        System.out.println(valid);
    }
    @Test
    public void run_code_RemoveDup(){
        RemoveDuplicatesFromArray rdf = new RemoveDuplicatesFromArray();
        int flag = rdf.solution(new int[]{1, 2, 2, 3, 3, 4, 4, 4, 5});
        System.out.println(flag);
    }
}

package Code.run;

//import Code.easy.MergeTwoSortedLists;
//import Code.easy.RemoveDuplicatesFromArray;
//import Code.easy.Sqrt;
//import Code.easy.ValidParentheses;
import Code.easy.*;
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
        int flag = rdf.solution_2(new int[]{-3,-1,0,0,0,3,3});
//        System.out.println(flag);
    }
    @Test
    public void run_code_MergeList(){
        MergeTwoSortedLists mtl = new MergeTwoSortedLists();
        mtl.Solution();
    }
    @Test
    public void run_code_Sqrt(){
        Sqrt sqrt = new Sqrt();
        int i = sqrt.mySqrt(2147395599);
        System.out.println(i);
    }
    @Test
    public void run_code_Stairs(){
        int index = climbStairs.solution(10);
//        System.out.println(index);
    }

}

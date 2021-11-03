package test.old;

import org.junit.Test;

import java.util.Arrays;

public class test2 {
    @Test
    public void run() throws Exception {
        String str1 = "银联国际有限公司|总部|技术运营部|标准及规范室";
        String str2 = "银联国际有限公司|境外分公司|香港分公司|综合管理室";
        boolean flag = ifHeadOffice(str1);
        String branchOffice = getBranchOffice(str2);
        System.out.println(branchOffice);

//        System.out.println(flag);
    }
    public static boolean ifHeadOffice(String str) throws Exception {
        try{
            String[] list = str.split("\\|");
            for (String s : list) {
                if (s.equals("总部"))
                    return true;
            }
        }catch (Exception e){
            throw new Exception("Error in splitting string");
        }
        return false;
    }
    public static String getBranchOffice(String str) throws NoBranchException{
        String[] list = str.split("\\|");
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("境外分公司")){
                return list[i+1];
            }

        }
        throw new NoBranchException("No branch office result found ");

    }
}

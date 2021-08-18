package Code.LeetCode.easy.Str;
class Solution {
    /**
     * easy
     * #67
     * binary,str,array
     * @param a
     * @param b
     * @return
     */
    static public String addBinary(String a, String b) {
        boolean flag =true;

        if (a.length()<b.length())
        {
            String temp =a;
            a=b;
            b=temp;

        }
        StringBuilder sbA = new StringBuilder(a);
        StringBuilder sb = new StringBuilder(b);
        //add 0 before a,in order to prevent overflowing
        sbA.insert(0,'0');
        a=sbA.toString();
        for (int i = 0; a.length()-b.length()-i>0 ; i++) {

            sb.insert(0, '0');
        }
        b=sb.toString();
        //now a and b have the same length
        boolean flow = false;
        int currentNum_a;
        int currentNum_b;
        StringBuilder result = new StringBuilder();


        for (int i = a.length()-1; i >0; i--) {
//            int currentNum_a =Integer.parseInt(String.valueOf(a.charAt(i))) ;
            if (flow){
                currentNum_a = a.charAt(i)-'0'+1;
                currentNum_b = b.charAt(i)-'0';
                flow =false;
            }else {
                currentNum_a = a.charAt(i)-'0';
                currentNum_b = b.charAt(i)-'0';
                flow = false;
            }
            if (currentNum_a+currentNum_b==0)
            {
                result.insert(0,'0');
                flow = false;
            }else if (currentNum_a+currentNum_b==1)
            {
                result.insert(0,'1');
                flow = false;
            }else if(currentNum_a+currentNum_b==2)
            {
                result.insert(0,'0');
                flow = true;

            }
            else if(currentNum_a+currentNum_b==3)
            {
                result.insert(0,'1');
                flow = true;

            }

        }
//        if ()
        if (flow==true)
        {
            result.insert(0,'1');
        }


        return (result.toString());


    }
}


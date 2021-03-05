package Code.BlueBridge;

import org.junit.Test;

import java.util.Scanner;

public class Find2020 {

    public static int findStr(String str){
        int prtSlow=0;
        int prtFast =3;
        int result =0;
        while (prtFast<str.length())

        {
            if (str.substring(prtSlow,prtFast+1).equals("2020")) {
                result++;
            }
            prtSlow++;
            prtFast++;
        }
        return result;

    }
    public static void main(String[] args) {
        char[][] r = new char[6][6];
        r[0]="220000".toCharArray();
        r[1]="000000".toCharArray();
        r[2]="002202".toCharArray();
        r[3]="000000".toCharArray();
        r[4]="000022".toCharArray();
        r[5]="000022".toCharArray();
//
//        Scanner sc = new Scanner(System.in);
//        for(int i=0; i<3; ++i) {
//            r[i] = sc.nextLine().toCharArray();
//        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char[] chars : r) {
            stringBuilder.append(chars[0]);

        }
        int result =0;



    }
}

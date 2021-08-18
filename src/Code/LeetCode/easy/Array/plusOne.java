package Code.LeetCode.easy.Array;

public class plusOne {
    public int[] solution(int[] digits) {

        int index =digits.length-1;
        int flag=0;
        digits[index]+=1;
        while(index>=0){
            digits[index]+=flag;
            if(digits[index]>9)
            {
                digits[index]=0;
                flag=1;

            }else{
                flag = 0;
                break;

            }
            index--;

        }

        int[] array = new int[digits.length+1];
        array[0]=1;
        if(flag==1){

            for (int i = 1; i < array.length; i++) {
                array[i]=digits[i-1];
            }
            return array;

        }else
        {
            return digits;
        }

        // return new int[]{1};
    }


}


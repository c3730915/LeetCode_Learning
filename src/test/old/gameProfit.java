package test.old;


public class gameProfit {

    public static void main(String[] args) {
        int customerNum = 100;
        double profit = 0;
        while ( profit<1000000 ){
            profit = (50*customerNum + 0.4*(50*customerNum) +0.2*(50*customerNum))*0.7 - 30*customerNum;
            customerNum++;
        }

        System.out.println("profit:"+ profit);
        System.out.println("customerNum:"+customerNum);



    }
}

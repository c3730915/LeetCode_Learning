package test;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class testDate {
    @Test
    public void testDate(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println( format.format( date ) );

        LocalDate myObj = LocalDate.now();
        myObj = myObj.plusMonths( 12);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        myObj.format( formatter );
        System.out.println(myObj);

    }
    @Test
    public void testBs64(){
        String str = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAALQAAAC0CAYAAAA9zQYyAAAABGdBTUEAALGPC/xhBQAAAAlwSFlzA...";
        String replace = str.replace( "data:image/png;base64,", "" );
        System.out.println(replace);
        String image_name = new String(Base64.getEncoder().encode( UUID.randomUUID().toString().getBytes() )) + ".jpg";
        System.out.println(image_name);
    }

    @Test
    public void testRandomSelect(){
        for ( int i = 0; i < 10 ; i++ ) {
            int A = i;
            int B = (int) ((10 - A) * 0.7);
            int C = 10 -A -B;
            System.out.println("A:"+A);
            System.out.println("B:"+B);
            System.out.println("C:"+C);
            System.out.println("=============");


        }
    }

    @Test
    public void test1(){
        Set<Integer> randomNumList = getRandomNumList( 99, 100, 200 );
        randomNumList.forEach( System.out::println );
    }

    public static Set<Integer> getRandomNumList(int size, int min, int max) {
        Set<Integer> resultSet = new HashSet<>();
        //防止错误调用引起死循环
        size = Math.min( Math.abs( max - min ), size );
        while ( resultSet.size() < size ) {
            int randomNum = ThreadLocalRandom.current().nextInt( min, max );
            resultSet.add( randomNum );
        }
        return resultSet;
    }



}

package test;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

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


}

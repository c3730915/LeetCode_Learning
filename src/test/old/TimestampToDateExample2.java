package test.old;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class TimestampToDateExample2 {
    public static void main(String args[]){
        Timestamp ts=new Timestamp(Long.parseLong("1467907200000"));
        Date joinTime=ts;
        //判断date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dateCurrent = new Date();

        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.add(Calendar.YEAR, -1); // to get previous year add -1
        Date previousYear = cal.getTime();
        System.out.println("Previous year is :"+previousYear);
        System.out.println("join time is:"+joinTime);
        System.out.println(joinTime.compareTo(previousYear));

    }
}
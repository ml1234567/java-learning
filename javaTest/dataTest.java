package javatest;
import javax.swing.*;
import java.sql.DataTruncation;
import java.sql.SQLOutput;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class dataTest {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.toString());
        System.out.println(cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DATE)+"日");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String sdf1=sdf.format(new Date());
        System.out.println(sdf1);
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
        String date1="2021-11-18";
        Date date3=sdf2.parse(date1);
        System.out.println(date3);
        TimeZone tz=TimeZone.getDefault();
        System.out.println(tz);
        String [] tim=TimeZone.getAvailableIDs();
        for (int i = 0; i < tim.length; i++) {
            System.out.println(tim[i]);
        }
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        System.out.println(new Date());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.of(2021,8,9));
        LocalDate ld=LocalDate.now();
        LocalDate newld=ld.withYear(1998).withMonth(11).withDayOfMonth(18);
        System.out.println(ld);
        System.out.println(newld);

    }
}

package com.feng._Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils(){}
    public static String dateToString(Date date,String format){
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(date);
        return s;
    }

    public static Date StringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;
    }
}

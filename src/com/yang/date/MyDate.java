package com.yang.date;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;


public class MyDate {

    // 返回日期相差天数
    public static Integer countDiffDay(String startDate, String endDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();

        long fTime = 0;
        long oTime = 0;

        try {
            cal.setTime(sdf.parse(startDate));
            fTime = cal.getTimeInMillis();

            cal.setTime(sdf.parse(endDate));
            oTime = cal.getTimeInMillis();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long betweenDays = (oTime - fTime) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(betweenDays));
    }
}

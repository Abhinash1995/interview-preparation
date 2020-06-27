package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

//String start = "2020-02-18";
//        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
//        Date startDate = null;
//        try {
//        startDate = format.parse(start);
//        } catch (ParseException e) {
//        e.printStackTrace();
//        }
//        String end = "2020-02-28";
//        System.out.println(startDate);


// Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.DAY_OF_MONTH, 10);
//        String endDate = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
public class Dates {
    public static void main(String[] args) {

        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        end.add(Calendar.DAY_OF_MONTH, 11);
        List<String> dates = new ArrayList<>();

//getting only firday between two dateRange
        while(start.before(end)){
            if(start.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY){
                Date targetDay = start.getTime();
                dates.add(new SimpleDateFormat("yyyy-MM-dd").format(targetDay));
            }
            start.add(Calendar.DATE, 1);
        }
        System.out.println(dates);

    }
}

package com.learning.corejava.DateConcepts;

import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args){

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(cal.getMinimalDaysInFirstWeek());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.AM_PM));







    }


}






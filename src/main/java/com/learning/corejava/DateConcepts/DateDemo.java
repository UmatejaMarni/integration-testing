package com.learning.corejava.DateConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args){

        Date d = new Date();
        System.out.println(d.toString()); //output - Sun Sep 14 17:32:52 IST 2025
        SimpleDateFormat sd = new SimpleDateFormat("M/d/YYYY hh:mm:ss");
        System.out.println(sd.format(d)); //output - 9/14/2025 05:34:59




    }
}

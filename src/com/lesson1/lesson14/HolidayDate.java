package com.lesson1.lesson14;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HolidayDate {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEEE dd MMMMM yyyy");
        Calendar c = sdf.getCalendar();
        c.set(2017, 11, 31);
        System.out.println("New Year 2018 is coming - " + sdf.format(c.getTime()));
        c.set(2018, 2, 8);
        System.out.println("World woman's day - " + sdf.format(c.getTime()));
        c.set(2018, 4, 15);
        System.out.println("My 22 birthday - " + sdf.format(c.getTime()));
    }
}

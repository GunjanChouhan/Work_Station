package Company;

import java.util.Calendar;
import java.util.TimeZone;

public class CH_98_Calendar_Class {
    public static void main(String[] args) {
//        Calendar c=Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}

package Introduction;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderClassExample {

    public static void main(String args[]) {
        CalenderClassExample.getCalendarDates();
    }

    public static void getCalendarDates() {
        Calendar calendar = new GregorianCalendar();

        System.out.println("DATE: " + calendar.DATE);
        System.out.println("MONTH: " + calendar.MONTH);
        System.out.println("YEAR: " + calendar.YEAR);

        System.out.println("DAY_OF_WEEK: " + calendar.DAY_OF_WEEK);
        System.out.println("DAY_OF_MONTH: " + calendar.DAY_OF_MONTH);
        System.out.println("DAY_OF_YEAR: " + calendar.DAY_OF_YEAR);

        System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.DAY_OF_WEEK_IN_MONTH);

        System.out.println("SUNDAY: " + calendar.SUNDAY);
        System.out.println("MONDAY: " + calendar.MONDAY);
        System.out.println("TUESDAY: " + calendar.TUESDAY);
        System.out.println("WEDNESDAY: " + calendar.WEDNESDAY);
        System.out.println("THURSDAY: " + calendar.THURSDAY);
        System.out.println("FRIDAY: " + calendar.FRIDAY);
        System.out.println("SATURDAY: " + calendar.SATURDAY);

        System.out.println("HOUR: " + calendar.HOUR);        // 12 hour clock
        System.out.println("HOUR_OF_DAY: " + calendar.HOUR_OF_DAY); // 24 hour clock
        System.out.println("MINUTE: " + calendar.MINUTE);
        System.out.println("SECOND: " + calendar.SECOND);
        System.out.println("MILLISECOND: " + calendar.MILLISECOND);
    }
}

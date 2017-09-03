import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;


public class DateUtilsExample {

    public static void main(String[] args) {

        Date today = new Date();
        System.out.println("Today: " + today);

        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Tomorrow: " + tomorrow);

        Date nextMonth = DateUtils.addMonths(today, 1);
        System.out.println("Next Month: " + nextMonth);

        Date nextYear = DateUtils.addYears(today, 1);
        System.out.println("Next Year: " + nextYear);

        // To check if two date objects are on the same day ignoring time.
        System.out.println("Is same day: "+ DateUtils.isSameDay(today, new Date()));
    }
}

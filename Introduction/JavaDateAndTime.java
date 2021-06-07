/**
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
 *
 * You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
 *
 * Example
 * month = 8
 * day = 14
 * year = 2017
 *
 * The method should return  as the day on that date.
 *
 * Function Description
 *
 * Complete the findDay function in the editor below.
 *
 * findDay has the following parameters:
 *
 * int: month
 * int: day
 * int: year
 * Returns
 *
 * string: the day of the week in capital letters
 * Input Format
 *
 * A single line of input containing the space separated month, day and year, respectively, in    format.
 */
package Introduction;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class JavaDateAndTime {

    public static void main(String args[]) throws IOException {
        /* Test via input from file */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = JavaDateAndTime.getDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

        /* Test via simple input */
        System.out.println(JavaDateAndTime.getDay(7, 5, 2015));

    }

    public static String getDay(int month, int day, int year) {

        Date date = new GregorianCalendar(year, month, day).getTime();

        DateFormat dateFormatter = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        return dateFormatter.format(date);
    }
}

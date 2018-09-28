package Introduction;//import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.concurrent.TimeUnit;

public class JavaDateAndTime {

    private static String getDay(String day, String month, String year){
        Calendar c = Calendar.getInstance();
        Locale locale = Locale.getDefault();
        c.set(Integer.parseInt(year),Integer.parseInt(month)-1,Integer.parseInt(day));
//        System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG, locale));
        String dayOfWeek=c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale).toUpperCase();
//        System.out.println(c.getTime());
        return dayOfWeek;

    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
        //getDay(day, month, year);
    }


}
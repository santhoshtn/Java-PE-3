import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class firstAndLastDate {
    public static void main(String[] args){
        System.out.println(firstLastDate());
    }
    public static String firstLastDate(){
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);


        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        String s1=(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        String s2=(df.format(c.getTime()));


        return s1+" "+s2;
    }
}

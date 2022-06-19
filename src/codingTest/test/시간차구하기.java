package codingTest.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class 시간차구하기 {
    public static void main(String[] args) {

        SimpleDateFormat f = new SimpleDateFormat("HH:mm");
        Date d1 = null;
        Date d2 = null;

        try {
            d1 = f.parse("01:00");
            d2 = f.parse("01:01");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long diff = d2.getTime() - d1.getTime();
        long sec = diff / (1000 * 60);
        System.out.println(sec);
    }
}

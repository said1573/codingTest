package codingTest.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

//        String number = "211020101011";
//
//        String regEx = "0[0-9]+0";
//
//        Pattern pattern = Pattern.compile(regEx);
//        Matcher matcher = pattern.matcher(number);
//
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//
//        }

        String dateStr1 = "2016.09.15 01.00.04.302";
        String dateStr2 = "0.302";

        try {
            Date format1 = new SimpleDateFormat("yyyy.mm.dd hh.MM.ss.SSS").parse(dateStr1);
            Date format2 = new SimpleDateFormat("ss.SSS").parse(dateStr2);

            Calendar calendar = Calendar.getInstance();
//            System.out.println(calendar.add(Calendar.MILLISECOND, 10));;

            long result = (format1.getTime() - format2.getTime());
            System.out.println("result : " + result);

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}

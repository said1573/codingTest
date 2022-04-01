package codingTest.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) throws ParseException {
        String strStartDate = "02/01";
        String strEndDate = "01/11";
        String strFormat = "MM/dd";    //strStartDate 와 strEndDate 의 format

        //SimpleDateFormat 을 이용하여 startDate와 endDate의 Date 객체를 생성한다.
        SimpleDateFormat sdf = new SimpleDateFormat(strFormat);
        try{
            Date startDate = sdf.parse(strStartDate);
            Date endDate = sdf.parse(strEndDate);

            //두날짜 사이의 시간 차이(ms)를 하루 동안의 ms(24시*60분*60초*1000밀리초) 로 나눈다.
            long diffDay = (startDate.getTime() - endDate.getTime()) / (24*60*60*1000);
            System.out.println(diffDay+"일");
        }catch(ParseException e){
            e.printStackTrace();
        }


    }

    public int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }
}

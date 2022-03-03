package codingTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 추석트래픽 {

    List<Integer> resultList = new ArrayList<>();

    public static void main(String[] args) {
        String[] lines = new String[]{
                "2016-09-15 20:59:57.421 0.351s",
                "2016-09-15 20:59:58.233 1.181s",
                "2016-09-15 20:59:58.299 0.8s",
                "2016-09-15 20:59:58.688 1.041s",
                "2016-09-15 20:59:59.591 1.412s",
                "2016-09-15 21:00:00.464 1.466s",
                "2016-09-15 21:00:00.741 1.581s",
                "2016-09-15 21:00:00.748 2.31s",
                "2016-09-15 21:00:00.966 0.381s",
                "2016-09-15 21:00:02.066 2.62s"};

        추석트래픽 java = new 추석트래픽();
        java.solution(lines);

    }

    public int solution(String[] lines) {

        List<String[]> transList = getTransList(lines);

//        for (int i = 0; i < lines.length; i++) {
//
//        }
        return 0;
//        return getMaxCount();
    }

    public int checkCount() {
        int result = 0;
        return result;
    }

    public int getMaxCount() {
        return Collections.max(resultList);
    }

    public List<String[]> getTransList(String[] lines) {
        List<String[]> transList = new ArrayList<>();

        for (int i = 0; i < lines.length; i++) {
            String[] array = lines[i].split(" ");
            System.out.println("line[" + i + "]" + Arrays.toString(array));

            String endTime = array[0] + " " + array[1];

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.mm.dd hh.MM.ss.SSS");

//            String formatDate = endTime -
//            simpleDateFormat.format(array[2]);
//            String startTime =

//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss.SSS");

//            array[1] - seconds;
            // 일자, 시작시간, 끝난시간으로 바꿈
            String[] result = new String[2];
//            result[0] = array[0];
//            result[1] =

            transList.add(result);
        }

        return transList;
    }

}

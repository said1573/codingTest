package codingTest.programmers;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class 추석트래픽2 {

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
    static long baseMills;
    static int ONE_DAY_MILLIS = 24 * 60 * 60 * 1000;

    public static void main(String[] args) {

    }

    public int solution(String[] lines) throws Exception {
        int[] timeCounter = new int[ONE_DAY_MILLIS + 1];

        baseMills = simpleDateFormat.parse("00:00:00.000").getTime();

        for (int lineIdx = 0; lineIdx < lines.length; lineIdx++) {
            String[] logTokens = lines[lineIdx].split(" ");
            int endMillis = (int)(simpleDateFormat.parse(logTokens[1]).getTime() - baseMills);
            int processMillis = Math.round(Float.parseFloat(logTokens[2].substring(0, logTokens[2].length() - 1)) * 1000);
            int startMillis = endMillis - processMillis + 1;

            // 시작 time을 999m 당겨서 1초범위씩 체크하도록 처리
            for (int time = Math.max(startMillis - 999, 0); time <= endMillis; time++) {
                timeCounter[time]++;
            }
        }

        return Arrays.stream(timeCounter).max().orElse(0);
    }
}

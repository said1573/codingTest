package codingTest.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 주차요금계산 {
    // 차량 번호 : 주차 누적 시간
    Map<Integer, Integer> sumTime = new HashMap<>();

    // 차량 번호 : 입차 시간
    Map<Integer, String> carInTime = new HashMap<>();

    private static int baseTime; // 기본 시간(분)
    private static int baseFee;  // 기본 요금(원)
    private static int time;     // 단워 시간(분)
    private static int fee;      // 단위 요금(원)

    public static void main(String[] args) {
        주차요금계산 java = new 주차요금계산();
        java.solution(new int[]{180, 5000, 10, 600}, new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"});
    }


    public int[] solution(int[] fees, String[] records) {

        baseTime = fees[0];
        baseFee = fees[1];
        time = fees[2];
        fee = fees[3];

        // 입차, 출차 처리
        for (int i = 0; i < records.length; i++) {
            String[] array = records[i].split(" ");

            String time = array[0];
            int carNumber = Integer.parseInt(array[1]);
            String action = array[2];

            // in 되었을 때
            if (action.equals("IN")) {
                carInTime.put(carNumber, time);
                continue;
            }

            // out 되었을 때
            String inTime = carInTime.get(carNumber);
            String outTime = time;

            int result = calcTime(inTime, outTime);
            sumTime.put(carNumber, sumTime.getOrDefault(carNumber, 0) + result);
            carInTime.remove(carNumber);

        }

        // 출차 되지 않은 차량 23:59분에 나간 것으로 처리
        Set<Integer> set = carInTime.keySet();
        for (int key : set) {
            int result = calcTime(carInTime.get(key), "23:59");
            sumTime.put(key, sumTime.getOrDefault(key, 0) + result);
        }

        // 차량 번호 : 주차 요금
        Map<Integer, Integer> resultMap = new HashMap<>();

        Set<Integer> carNums = sumTime.keySet();
        for (int carNum : carNums) {
            int resultFee = clacFee(sumTime.get(carNum));
            resultMap.put(carNum, resultFee);
        }

        // 차량번호 오름차순으로 정렬하여 주차요금 리턴
        int[] carNumberArray = new int[resultMap.size()];
        Set<Integer> sets = resultMap.keySet();
        int i = 0;
        for (int carNum : sets) {
            carNumberArray[i] = carNum;
            i++;
        }

        Arrays.sort(carNumberArray);

        System.out.println(Arrays.toString(carNumberArray));
        System.out.println("resultMap : " + resultMap);
        System.out.println("sumTime   : " + sumTime);

        int[] answer = new int[resultMap.size()];
        for (int index = 0; index < carNumberArray.length; index++) {
            answer[index] = resultMap.get(carNumberArray[index]);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public int calcTime(String inTime, String outTime) {
        String[] inTimeArray = inTime.split(":");
        String[] outTimeArray = outTime.split(":");

        int in = Integer.parseInt(inTimeArray[0]) * 60 + Integer.parseInt(inTimeArray[1]);
        int out = Integer.parseInt(outTimeArray[0]) * 60 + Integer.parseInt(outTimeArray[1]);

        return out - in;
    }

    public int clacFee(int minutes) {
        if (minutes <= baseTime) {
            return baseFee;
        } else {
            return baseFee + ((int) (Math.ceil((double) (minutes - baseTime) / time) * fee));
        }
    }
}

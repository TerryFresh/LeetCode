package LeetCode;

//Medium

//Given an array of integers temperatures represents the daily temperatures,
//return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
// If there is no future day for which this is possible, keep answer[i] == 0 instead.

//Учитывая массив целых чисел температуры, представляющий дневные температуры, верните ответ в виде массива таким образом,
// что answer[i] — это количество дней, которые вы должны ждать после i-го дня,
// чтобы получить более теплую температуру. Если нет будущего дня, для которого это возможно, вместо этого оставьте answer[i] == 0.

import java.util.Arrays;

public class I739DailyTemperatures {
    public static void main(String[] args) {

        int[] temp = new int[]{73,74,75,71,69,72,76,73}; //Output: [1,1,4,2,1,1,0,0]
//        int[] temp = new int[]{30,40,50,60}; //Output: [1,1,1,0]
//        int[] temp = new int[]{30,60,90}; //Output: [1,1,0]
        System.out.println(Arrays.toString(temp));

        System.out.println(Arrays.toString(dailyTemperatures(temp)));
    }

//    public static int[] dailyTemperatures(int[] temperatures) {
//        int[] result = new int[temperatures.length];
//
//        for (int i = 0; i < temperatures.length; i++) {
//            for (int j = i + 1; j < temperatures.length; j++) {
//                if(temperatures[i] < temperatures[j]) {
//                    result[i] = j - i;
//                    break;
//                }
//            }
//        }
//        return result;
//    }
//}
//Time Limit Exceeded

//    public static int[] dailyTemperatures(int[] temperatures) {
//        int[] result = new int[temperatures.length];
//
//        for (int i = temperatures.length - 2; i >= 0; i--) {
//            int j = i + 1;
//            while (temperatures[i] >= temperatures[j] && result[j] != 0) {
//                j += result[j];
//            }
//            if (temperatures[i] < temperatures[j]) {
//                result[i] = j - i;
//            }
//        }
//        return result;
//    }
//}
//Runtime: 12 ms, faster than 96.89% of Java online submissions for Daily Temperatures.
//https://leetcode.com/problems/daily-temperatures/discuss/1574831/Java-2-Simple-Approaches-or-Constant-space-or-Stack-or-Beats-100-or-TC%3A-O(N)-SC%3A-O(1)

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for (int i = temperatures.length -1; i >= 0 ; i--) {
            for (int j = i-1; j >= 0; j--) {
                if (temperatures[j] < temperatures[i]) {
                    result[j] = i - j;
                    break;
                }
            }
        }
        return result;
    }
}
//Time Limit Exceeded
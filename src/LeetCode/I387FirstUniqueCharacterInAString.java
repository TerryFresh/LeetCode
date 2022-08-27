package LeetCode;

//Easy

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

//Для заданной строки s найти в ней первый неповторяющийся символ и вернуть его индекс. Если он не существует, верните -1.

//Example 1:
//Input: s = "leetcode"
//Output: 0
//Example 2:
//Input: s = "loveleetcode"
//Output: 2
//Example 3:
//Input: s = "aabb"
//Output: -1

import java.util.HashMap;
import java.util.Objects;

public class I387FirstUniqueCharacterInAString {
    public static void main(String[] args) {
//        String s = "aabb";
//        String s = "leetcode";
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));

    }

    public static int firstUniqChar(String s) {
        int[] alphabetCounter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabetCounter[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (alphabetCounter[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
//Runtime: 11 ms, faster than 80.52% of Java online submissions for First Unique Character in a String.

//    public static int firstUniqChar(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//
//            if (!map.containsKey(currentChar)) {
//                map.put(currentChar, i);
//            }
//            else map.put(currentChar, -1);
//        }
//
//        int min = Integer.MAX_VALUE;
//
//        for (char c : map.keySet()) {
//            if (map.get(c) > -1 && map.get(c) < min) {
//                min = map.get(c);
//            }
//        }
//
//        return (min == Integer.MAX_VALUE) ? -1 : min;
//    }
//}
//Runtime: 49 ms, faster than 37.13% of Java online submissions for First Unique Character in a String.

//    public static int firstUniqChar(String s) {
//        int count = 0;
//        int result = -1;
//        String[] split = s.split("");
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
//                if (Objects.equals(split[i], split[j])){
//                    count++;
//                    if (count > 1){
//                        count = 0;
//                        break;
//                    }
//                }
//            }
//            if (count == 1){
//                result = i;
//                break;
//            }
//        }
//        return result;
//    }
//}
//Runtime: 279 ms, faster than 5.11% of Java online submissions for First Unique Character in a String.


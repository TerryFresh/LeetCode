package LeetCode.NoSolution;

//Easy

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

//Имея две строки s и t, вернуть true, если t является анаграммой s, и false в противном случае.
//Анаграмма — это слово или фраза, образованная путем перестановки букв другого слова или фразы, обычно с использованием всех исходных букв ровно один раз.
//Дополнение: что, если входные данные содержат символы Unicode? Как бы вы адаптировали свое решение к такому случаю?

public class I242ValidAnagram {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "dcba";
        System.out.println(isAnagram(s,t));

    }

    //Runtime: 5 ms, faster than 75.47% of Java online submissions for Valid Anagram.
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for(int count : counter){
            if (count != 0){
                return false;
            }
        }
        return true;
    }

    //Runtime: 162 ms, faster than 5.04% of Java online submissions for Valid Anagram.
//    public static boolean isAnagram(String s, String t) {
//        String[] s1 = s.split("");
//        String[] s2 = t.split("");
//        Arrays.sort(s1);
//        Arrays.sort(s2);
//
//        return Arrays.equals(s1, s2);
//    }
}

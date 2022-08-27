package LeetCode;

//Easy

//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//Clarification:
//What should we return when needle is an empty string? This is a great question to ask during an interview.
//For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

//Учитывая две строки игла и стог сена, вернуть индекс первого вхождения иглы в стог сена или -1, если игла не является частью стога сена.
//Уточнение:
//Что мы должны вернуть, если игла — пустая строка? Это отличный вопрос, который можно задать во время интервью.
//Для решения этой задачи мы вернем 0, если игла — пустая строка. Это соответствует функциям strstr() языка C и indexOf() языка Java.

public class I28ImplementstrStr {
    public static void main(String[] args) {
        String s1 = "qwer";
        String s2 = "";
        System.out.println(strStr(s1, s2));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle))
            return haystack.indexOf(needle);
        return -1;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement strStr().


package LeetCode;

//Easy

//Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.

//Для заданной строки s, состоящей из нескольких слов, разделенных некоторым количеством пробелов, вернуть длину последнего слова в строке.
//Слово — это максимальная подстрока, состоящая только из непробельных символов.

public class I58LengthOfLastWord {
    public static void main(String[] args) {
        String s = "day before   ";

        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int spaceId = s.trim().lastIndexOf(" ");
        return s.trim().length() - (spaceId + 1);
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement strStr().

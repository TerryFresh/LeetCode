package LeetCode;

//Easy

//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote.

//Имея две строки ransomNote и magazine, верните true, если ransomNote можно составить, используя буквы из magazine, и false в противном случае.
//Каждая буква в журнале может быть использована в выкупе только один раз.

//Example 1:
//Input: ransomNote = "a", magazine = "b"
//Output: false
//Example 2:
//Input: ransomNote = "aa", magazine = "ab"
//Output: false
//Example 3:
//Input: ransomNote = "aa", magazine = "aab"
//Output: true

public class I383RansomNote {
    public static void main(String[] args) {
        String ransomNote = "fffbfg";
        String magazine = "effjfggbffjdgbjjhhdegh";

        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabetCounter = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            alphabetCounter[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--alphabetCounter[ransomNote.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }
}
//Runtime: 4 ms, faster than 84.52% of Java online submissions for Ransom Note.

//    public static boolean canConstruct(String ransomNote, String magazine) {
//
//        for (int i = 0; i < ransomNote.length(); i++) {
//            String[] ransomSplit = ransomNote.split("");
//            if (magazine.contains(ransomSplit[i])){
//                magazine = magazine.replaceFirst(String.valueOf(magazine.charAt(magazine.indexOf(ransomSplit[i]))), "");
//            } else return false;
//        }
//        return true;
//    }
//}
//Runtime: 333 ms, faster than 5.05% of Java online submissions for Ransom Note.

package LeetCode.Help;

import java.util.ArrayList;

public class TuskFromTG1 {
    public static void main(String[] args) {
        long m = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        arrayList.add(7);
        arrayList.add(909);
        arrayList.add(123);
        arrayList.add(45);
        arrayList.add(67);

        String s = "";

        for (int i = 0; i < arrayList.size(); i++) {
            s += arrayList.get(i);
        }
        for (int i = 0; i < s.length(); i++) {
            result.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        System.out.println(s);
        System.out.println(result);
        System.out.println((double) (System.currentTimeMillis() - m) + " ms");
    }
}

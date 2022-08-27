package LeetCode.Help;


public class Fibonachi {
    public static void main(String[] args) {

        long m = System.currentTimeMillis();

        long input = 13;
        long result = 0;
        long first = 0;
        long second = 1;
        for (int i = 0; i < input ; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        System.out.println(result);
        System.out.println((double) (System.currentTimeMillis() - m));
    }
}
//static int fibonachi(int n){
//
//    if (n == 0){
//        return 0;
//    }
//    if (n == 1){
//        return 1;
//    }
//    else{
//        return fibonachi(n - 1) + fibonachi(n - 2);
//    }
//}


//Comparator<String> comparator = (o1,o2) -> o1.length() - o2.length();
//Arrays.sort(words, comparator);
//Сортировка массива по длинне слов
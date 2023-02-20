package LeetCode.Help;


public class Fibonachi {
    public static void main(String[] args) {

        //totalMemory() - Возвращает общий объем памяти виртуальной машины Java. freeMemory() - Возвращает количество свободной памяти в виртуальной машине Java.
        long usedBytes = Runtime.getRuntime().totalMemory()- Runtime.getRuntime().freeMemory();
        long m = System.currentTimeMillis();

        long input = 31;
        long result = 0;
        long first = 0;
        long second = 1;
        for (int i = 0; i < input -1; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        System.out.println(result);
        System.out.println((double) (System.currentTimeMillis() - m) + " Ms");


        System.out.println(fibo(input));
        System.out.println((double) (System.currentTimeMillis() - m) + " Ms");
        System.out.println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1048576 + "MB");

        System.out.println(fibonachi(input));
        System.out.println((double) (System.currentTimeMillis() - m) + " Ms");


    }

    public static long fibo(long number){
//        return Math.round(Math.pow(1.61803398874989484820, number) / Math.sqrt(5));
        return Math.round(Math.pow(1.618033988749894848204586834365638117720309179805762862135448, number) / Math.sqrt(5));
    }

    static long fibonachi(long n){  //самый медленный метод
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
}


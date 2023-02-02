package LeetCode.NoSolution;

//Medium

//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//Return true if you can reach the last index, or false otherwise.

//Вам дан целочисленный массив nums. Изначально вы находитесь в первом индексе массива, и каждый элемент массива представляет максимальную длину прыжка в этой позиции.
//Верните true, если вы можете добраться до последнего индекса, или false в противном случае.

public class I55JumpGame {
    public static void main(String[] args) {
//        int[] nums = new int[]{2,3,1,1,4}; //true
//        int[] nums = new int[]{3,2,1,0,4};   //false
//        int[] nums = new int[]{2,0,0};   //true
//        int[] nums = new int[]{0,1};   //false
//        int[] nums = new int[]{1,2,0,1};   //true
//        int[] nums = new int[]{2,0,2,0,1};   //true
        int[] nums = new int[]{2,0,1,0,1};   //false
//        int[] nums = new int[]{3,0,8,2,0,0,1};   //true

        System.out.println(canJump(nums));
    }

//    public static boolean canJump(int[] nums) {
//        int boundary = 0;
//        for(int i =0;i<=boundary;i++){
//            boundary = Math.max(boundary,i+nums[i]);
//            if(boundary >=nums.length-1)
//                return true;
//        }
//        return false;
//    }
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Jump Game.


    //Мы берем доступную переменную для хранения максимального индекса, которого мы можем достичь в любой момент времени.
    //Первоначально значение достижимой переменной равно 0;
    //Если сумма значения индекса (i) и значения в индексе (nums [i]) больше, чем достижимая, мы заменяем значение в достижимой переменной этой суммой.
    //В любой момент, если мы обнаружим, что значение индекса (i) больше, чем достижимая переменная, мы вернем false.
    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i=0; i<nums.length; ++i) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
//Runtime: 2 ms, faster than 92.42% of Java online submissions for Jump Game.

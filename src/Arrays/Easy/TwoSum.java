package Arrays.Easy;

import java.util.HashMap;

public class TwoSum {
    public static void twoSum(int[] nums, int target){

        int[] result = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
            }

            map.put(nums[i], i);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        // Naive Solution :- TC O(N^2) SC O(1)
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if(nums[i] + nums[j] == target){
        //             System.out.print(i + " " + j);
        //         }
        //     }
        // }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };

        int target = 9;

        twoSum(nums, target);
    }
}

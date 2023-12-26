package Arrays.Easy;

public class MoveZeroToEnd {
    public static void moveZeros(int[] nums) {

        int n = nums.length;

        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos++] = nums[i];
            }
        }

        while (pos < n) {
            nums[pos++] = 0;
        }

        // Optimised Solution :-

        // int cnt = 0;

        // for (int i = 0; i < nums.length; i++) {
        // if(nums[i] != 0){
        // int temp = nums[i];
        // nums[i] = nums[cnt];
        // nums[cnt] = temp;
        // cnt++;
        // }
        // }

        // Naive Solution :- TC O(n^2) SC O(1)
        // for (int i = 0; i < nums.length; i++) {
        // if(nums[i] == 0){
        // for (int j = i+1; j < nums.length; j++) {
        // if(nums[j] != 0){
        // int temp = nums[i];
        // nums[i] = nums[j];
        // nums[j] = temp;
        // break;
        // }
        // }
        // }
        // }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };

        moveZeros(nums);
    }
}

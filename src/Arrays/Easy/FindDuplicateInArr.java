package Arrays.Easy;

// import java.util.Arrays;
// import java.util.HashSet;

public class FindDuplicateInArr {
    public static int findDuplicate(int nums[]){
        // int n = nums.length-1;

        //Fully Optimised :- :- TC O(n) SC O(1)
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = 0;

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

        //Slightly More Optimised :- TC O(n) SC O(n)
        // HashSet<Integer> set = new HashSet<>();

        // for (int i = 0; i < nums.length; i++) {
        //     if(!set.contains(nums[i]))
        //     set.add(nums[i]);
        //     else
        //     return nums[i];
        // }

        // return -1;
        

        //Slightly Optimised :- TC O(n log n) SC O(1);
        // Arrays.sort(nums);
        
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1])
        //         return nums[i];
        // }
        // return -1;

        //Naive Solution :- TC O(n^2) SC O(1);
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i+1; j < n; j++) {
        //         if(nums[i] == nums[j])
        //         return nums[i];
        //     }
        // }

        // return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 2, 2};

        System.out.println(findDuplicate(nums));
    }
}

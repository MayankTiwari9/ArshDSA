package Arrays.Easy;

// import java.util.HashSet;

public class RemoveDupFromSorArr {
    public static void removeDuplicated(int nums[]){

        //Optimised Solution :- TC O(n) SC O(1)
        int j = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]){
                nums[j++] = nums[i];
            }
        }

        nums[j++] = nums[nums.length-1];

        // return j;

        for (int i = 0; i < j; i++) {
            System.out.print(nums[i] + " ");
        };


        //Naive Solution :- TC O(n) SC O(n)

        // HashSet<Integer> set = new HashSet<>();

        // for (int i = 0; i < nums.length; i++) {
        //     set.add(nums[i]);
        // }

        // for (int i = 0; i < set.size(); i++) {
        //     System.out.print(set);
        // }

        // return set.size();
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 2};

        removeDuplicated(nums);
    }
}

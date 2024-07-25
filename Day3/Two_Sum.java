import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // BRUTE FORCE
        // for (int i = 0; i<nums.length-1; i++) {
        //     for (int j = i+1; j<nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};

        HashMap<Integer, Integer> ht = new HashMap<>();
        int res[] = new int[2];
        for (int i = 0; i<nums.length; i++) {
            if (ht.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = ht.get(target - nums[i]);
                return res;
            }
            ht.put(nums[i], i);
        }
        return res;
    }
}